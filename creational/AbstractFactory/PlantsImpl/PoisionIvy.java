package creational.AbstractFactory.PlantsImpl;

import creational.AbstractFactory.PlantsInterface.WeedPlant;

public class PoisionIvy implements WeedPlant {

    @Override
    public void getDescription() {
        System.out.println("Poison ivy is a type of allergic plant in the genus Toxicodendron native to Asia and North America");
    }

    @Override
    public void getWeed(String name) {
        System.out.println(name+" had a bad allergy due to poison ivy");
    }

    

}
