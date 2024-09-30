package SOLID.Liskov.example1;

public class largeOrder implements Discount{

    @Override
    public double discoutedPrice(double orderValue) {
        if(orderValue> 5000 && orderValue < 10000 ){
            return orderValue -orderValue*5/100;
        }
        else if( orderValue > 10000){
            return orderValue - orderValue * 10/100;
        }
        else{
            return orderValue;
        }
    }
    
}
