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


    public void prizeSelection()
    {
        for (Toy toy : toyСollection) {
            double random = Math.random() * 100;
            if (random < toy.getСhance()) {
                collectionPrizes.add(toy);
            }
        }
    }








}
