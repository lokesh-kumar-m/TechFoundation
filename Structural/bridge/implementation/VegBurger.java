package Structural.bridge.implementation;

public class VegBurger extends Burger {

    public VegBurger(String bun,String sauce,String patty){
        super(bun,sauce,patty);
    }

    @Override
    public void compose() {
        System.out.println("Adding letuice, yallepineo, tomato and pickles");
    }

    @Override
    public String wrap() {
        return "Veggie Burger";
    }
    
}
