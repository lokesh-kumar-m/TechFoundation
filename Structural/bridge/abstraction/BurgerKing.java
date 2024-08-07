package Structural.bridge.abstraction;

import Structural.bridge.implementation.Burger;

public class BurgerKing extends Eatery {
    private String name;

    public BurgerKing(Burger burger) {
        super(burger);
        this.name="BurgerKing";
    }

    @Override
    String Service() {
        return name;
    }
    
}
