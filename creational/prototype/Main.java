package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Car volvoCar=new Volvo( "Black");
        System.out.println(volvoCar.getCarInfo());
        Car diffVolvo=volvoCar.copy();
        diffVolvo.setColour("orange");
        System.out.println(diffVolvo.getCarInfo());

        Car scania=new Scania( "Blue");
        System.out.println(scania.getCarInfo());
        Car diffScania=scania.copy();
        diffScania.setColour("Green");
        System.out.println(diffScania.getCarInfo());
    
    }
}
