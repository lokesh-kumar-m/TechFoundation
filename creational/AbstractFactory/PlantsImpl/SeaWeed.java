package creational.AbstractFactory.PlantsImpl;

import creational.AbstractFactory.PlantsInterface.WeedPlant;

public class SeaWeed implements WeedPlant {

    @Override
    public void getDescription() {
        System.out.println("seaweed such as kelp provide natural habitat to fishes and other acquatic animals");
        System.out.println("Some of the seaweed are edible");
    }

    @Override
    public void getWeed(String name) {
        System.out.println("A particualr type of seaweed is commonly eaten by "+name);
    }

    



}
