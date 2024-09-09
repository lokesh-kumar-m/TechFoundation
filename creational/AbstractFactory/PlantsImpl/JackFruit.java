package creational.AbstractFactory.PlantsImpl;

import creational.AbstractFactory.PlantsInterface.FruitPlant;

public class JackFruit implements FruitPlant {

    @Override
    public void getDescription() {
        System.out.println("Jack fruit is a tree belonging to Moraceae family.");
        System.out.println("The fruit can reach a maximum weight of 55 kg and 90 cm in length.");
        System.out.println("It is a multiple fruit consisting of hundreds and thousands of individual flowers and fresh petals in a single fruit");
        System.out.println("The ripe fruit is sweet and is commonly used as desserts, the petals are in yellow colour");
    }

    @Override
    public void getFruits(String name) {
        System.out.println("Jackfruit is "+name+"'s fav fruit");
    }
    
    
    
}
