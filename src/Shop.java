import java.util.ArrayList;

public class Shop {
    private ArrayList<Toy> toyСollection;
    private ArrayList<Toy> collectionPrizes;
    private String prizeFile = "Prize.txt";

    public Shop() {
        toyСollection = new ArrayList<Toy>();
        collectionPrizes= new ArrayList<Toy>();
    }


    public String getPrizeFilePath() {
        return prizeFile;
    }

    public void addToy(Toy toy) {
        toyСollection.add(toy);
    }

}
