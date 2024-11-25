package SOLID.Open_Closed.Restaurant;

public class Restaurant {
    public static void main(String[] args) {
        Menu veg=new VegMenu();
        veg.menu();
        Menu nonveg=new NonVegMenu();
        nonveg.menu();
    }
}
