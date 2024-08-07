package Structural.bridge.implementation;

public class MeatBurger extends Burger{
    public MeatBurger(String bun, String sauce, String patty) {
        super(bun, sauce, patty);
    }

    @Override
    public void compose() {
        System.out.println("Adding meatballs patty and cheese");
    }

    @Override
    public String wrap() {
        return "Meat Burger";
    }
}
