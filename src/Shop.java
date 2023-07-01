import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Shop
{
    private ArrayList<Toy> toyСollection;
    private ArrayList<Toy> collectionPrizes;
    private String prizeFile = "Prize.txt";

    public Shop()
    {
        toyСollection = new ArrayList<Toy>();
        collectionPrizes= new ArrayList<Toy>();
    }


    public String getPrizeFilePath()
    {
        return prizeFile;
    }

    public void addToy(Toy toy)
    {
        toyСollection.add(toy);
    }

    public void changeToy(int Id, double newValue)
    {
        for (Toy toy : toyСollection)
        {
            if (toy.getId() == Id)
            {
                toy.setСhance(newValue);
            }
        }
    }

    public void viewCollection (ArrayList<Toy> collection) {
        for (Toy toy : collection) {
            System.out.println(toy);
        }
    }


    public void prizeSelection()
    {
        for (Toy toy : toyСollection) {
            double random = Math.random() * 100;
            if (random < toy.getСhance()) {
                collectionPrizes.add(toy);
            }
        }
    }


    public void getPrize() {
        if (!collectionPrizes.isEmpty()) {
            Toy prizeToy = collectionPrizes.remove(0);
            prizeToy.setQuantity(prizeToy.getQuantity() - 1);

            try {
                FileWriter writer = new FileWriter(prizeFile, true);
                writer.write(prizeToy.getName() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл игрушки");
            }
        } else {
            System.out.println("Все игрушки кончились");
        }
    }








}
