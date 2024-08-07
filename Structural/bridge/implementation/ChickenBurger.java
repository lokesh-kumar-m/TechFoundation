package Structural.bridge.implementation;

public class ChickenBurger extends Burger {
    public ChickenBurger(String bun, String sauce, String patty) {
        super(bun, sauce, patty);
    }

    @Override
    public void compose() {
        System.out.println("Added spice toppings");
    }

    @Override
    public String wrap() {
        return "Chicken Burger";
    }
}
