package creational.AbstractFactory.PlantsImpl;

import creational.AbstractFactory.PlantsInterface.FLowerPlant;

public class Rose implements FLowerPlant {

    @Override
    public void getDescription() {
        System.out.println("Rose is a perennial flowering plant of genus rosa, in the family Rosaceae");
    }

    @Override
    public void getFlowers(String name) {
        System.out.println(name+" was presented with varios colours of rose flowers.");
    }

    



}
