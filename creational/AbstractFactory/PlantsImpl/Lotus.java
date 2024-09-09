package creational.AbstractFactory.PlantsImpl;

import creational.AbstractFactory.PlantsInterface.FLowerPlant;

public class Lotus implements FLowerPlant {

    @Override
    public void getDescription() {
        System.out.println("Sacred lotus or Nelumbo is a aquatic plant with large , showy flowers.");
        System.out.println("These belong to the family Nymphaeaceae and are commonly present in pink colour.");
        System.out.println("The leafs are water repellent and the shoots can be extracted to create fabric");
        System.out.println("A few parts of the plant are edible.");
    }

    @Override
    public void getFlowers(String name) {
        System.out.println(name+" created a pond with a lotus pool");
    }

    

}
