package SOLID.Liskov.example1;

public class Spot implements IDiscount{

    private boolean spotPayment;

    public Spot(boolean spotPayment){
        this.spotPayment =spotPayment;
    }

    @Override
    public double discoutedPrice(double orderValue) {
        if(spotPayment)
        return orderValue - orderValue * 5/100;
        else
        return orderValue;
    }
    
}
