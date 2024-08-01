package creational.AbstractFactory.Plants;

import creational.AbstractFactory.FruitPlant;

public class Mango implements FruitPlant {

    @Override
    public void getDescription() {
        System.out.println("Mango is a tropical delicacy. It is referred as Mangifera indica");
        System.out.println("Japan creates the most costly mangoes, which sells for a few thousand dollars");
    }

    @Override
    public void getFruits(String name) {
        System.out.println(name+" ate mango and planted the seed.");
    }


    
}
