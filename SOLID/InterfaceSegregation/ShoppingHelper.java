package SOLID.InterfaceSegregation;

public class ShoppingHelper {
    public static void main(String[] args) {
        Willys willys=new Willys();
        Rusta rusta=new Rusta();
        Ikea ikea=new Ikea();

        System.out.println("****************Shop Willys****************");

        willys.fruits();
        willys.veggies();
        willys.snacks();

        System.out.println("*****************Shop Rusta******************");
        rusta.snacks();
        rusta.spices();
        rusta.Tv();
        rusta.lightpoles();

        System.out.println("******************Shop Ikea********************");
        ikea.clothings();
        ikea.beds();
        ikea.lightpoles();
        ikea.oven();
        ikea.gardenDecorLights();
    }
}
