package SOLID.Liskov.example1;

public class MultiYear implements Discount{

    private double discout=5.0/100;

    @Override
    public double discoutedPrice(double orderValue) {
        return orderValue-orderValue*discout;
    }
    
}
