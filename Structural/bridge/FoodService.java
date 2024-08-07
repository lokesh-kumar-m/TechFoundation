package Structural.bridge;
//dimensions are type of burgers and burger restaurents 
import Structural.bridge.abstraction.BurgerKing;
import Structural.bridge.abstraction.Eatery;
import Structural.bridge.abstraction.MaxxBurgers;
import Structural.bridge.implementation.ChickenBurger;
import Structural.bridge.implementation.VegBurger;

public class FoodService {
    public static void main(String[] args) {
        Eatery vegburger=new MaxxBurgers(new VegBurger("oregano","Choptle,Chilli Mayo","Halloumi"));
        vegburger.createBurger();

        Eatery nonvegburger=new MaxxBurgers(new ChickenBurger("glutenfre", "BBQ, Garlic Mayo", "Fried Chicken"));
        nonvegburger.createBurger();        
        
        Eatery burgerking=new BurgerKing(new ChickenBurger("baked","Chilli Mayo,BBQ","Crispy Chicken"));
        burgerking.createBurger();

        Eatery veggie=new BurgerKing(new VegBurger("baked","Chilli Mayo,BBQ","TLC Teriyaki"));
        veggie.createBurger();
        
    }
    
}
