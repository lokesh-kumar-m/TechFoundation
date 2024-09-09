package creational.AbstractFactory.PlantsImpl;

import creational.AbstractFactory.PlantsInterface.FruitPlant;

public class Strawberry implements FruitPlant {

    @Override
    public void getDescription() {
        System.out.println("Strawberries are widely grown hybrid species of the genus Fragaria in the rosa family.");
        System.out.println("These are also known as false berries.");
    }

    @Override
    public void getFruits(String name) {
        System.out.println(name+" like anything that contains strawberries.");
    }



}
