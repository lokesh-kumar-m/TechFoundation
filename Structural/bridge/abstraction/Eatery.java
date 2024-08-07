package Structural.bridge.abstraction;
//Every burger is made using similar steps, the taste and type is altered by veg/nonveg/patty/toppings etc.
//The structure is same for all.
//Client need to order from the burger restaurants. The type of burger is can be seconday
import Structural.bridge.implementation.Burger;

public abstract class Eatery {
    protected Burger burger;

    public Eatery(Burger burger){
        this.burger=burger;
    }

    abstract String Service();

    private void choosenBun(){
        System.out.println(burger.getBuns()+" bread");
    };
    private void choosenSauce(){
        System.out.println(burger.getSauce()+" sauce");
    };
    private void choosenAddons(){
        System.out.println(burger.getPatty()+" patty");
    };

    public void createBurger(){
        System.out.println("Your choices");
        choosenBun();
        choosenAddons();
        choosenSauce();
        burger.compose();
        System.out.println("Enjoy your "+burger.wrap()+" from "+Service());
    }
    
}
