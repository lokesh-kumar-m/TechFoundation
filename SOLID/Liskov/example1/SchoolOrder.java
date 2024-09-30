package SOLID.Liskov.example1;

public class SchoolOrder {
    public static void main(String[] args) {
        double orderValue = 6000;
        System.out.println(new MultiYear().discoutedPrice(orderValue));
        double discPrice= new largeOrder().discoutedPrice(new MultiYear().discoutedPrice(orderValue));
        System.out.println(discPrice);
        Discount spot=new Spot(true);
        System.out.println(spot.discoutedPrice(discPrice));
    }
}
