package Structural.decorator;

public class User {
    public static void main(String[] args) {
        Laptop station11=new ExternalDisplay(new KeyBoardAndMouse(new LaptopImpl("work")));
        System.out.println(station11.workStation());
    }
}
