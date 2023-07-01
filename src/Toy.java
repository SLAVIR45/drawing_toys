public class Toy {
    private int id;
    private String name;
    private int quantity;
    private double chance;

    private static Integer idCounter = 0;

    public static synchronized int createID()
    {
        return idCounter++;
    }

    public Toy(int id, String name, int quantity, double chance) {
        this.id = createID();
        this.name = name;
        this.quantity = quantity;
        this.chance = chance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getСhance() {
        return chance;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setСhance(double chance) {
        this.chance = chance;
    }
}
