package creational.AbstractFactory.Plants;

import creational.AbstractFactory.FLowerPlant;

public class WaterLily implements FLowerPlant {

    @Override
    public void getDescription() {
        System.out.println("Nymphaeaceae is a family of flowering plant, commonly known as water lily. They live in tropical and temerate climates");
    }

    @Override
    public void getFlowers(String name) {
        System.out.println(name+" cultivates water lily");
    }

    


}
