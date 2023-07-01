
public class Main
{
    public static void main(String[] args)
    {
        Shop shop = new Shop();

        Toy toy1 = new Toy(Toy.createID(),"Маска", 3,10);
        Toy toy2 = new Toy(Toy.createID(),"Кубик", 5,50);
        Toy toy3 = new Toy(Toy.createID(),"Мяч", 1,40);
        Toy toy4 = new Toy(Toy.createID(),"Машинка", 4,60);

        shop.addToy(toy1);
        shop.addToy(toy2);
        shop.addToy(toy3);
        shop.addToy(toy4);
        shop.viewCollectionToy();
        System.out.println("");

        shop.changeToy(1, 30);
        shop.prizeSelection();
        shop.prizeSelection();
        shop.viewCollectionPrize();
        System.out.println("");
        shop.getPrize();
        shop.viewCollectionPrize();
        System.out.println("");
        shop.viewCollectionToy();

    }
}