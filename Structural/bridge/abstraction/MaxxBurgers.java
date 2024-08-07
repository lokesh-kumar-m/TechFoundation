package Structural.bridge.abstraction;
//Adding their trademark with company name
import Structural.bridge.implementation.Burger;

public class MaxxBurgers extends Eatery{
    private String name;

    public MaxxBurgers(Burger burger) {
        super(burger);
        this.name="Maxx Burgers";
    }

    @Override
    String Service() {
        return name;
    }
    
}
