package creational.AbstractFactory.Plants;

import creational.AbstractFactory.FruitPlant;

public class Cranberry implements FruitPlant {

    private String name;
    private String colour;

    public Cranberry(){
        this.name="Cranberry";
        this.colour="Red";
    }

    @Override
    public void getDescription() {
        System.out.println(name+" are a group of evergreen dwarf shrubs of vines");
        System.out.println("These consists of high nutrients and antioxidants."+name+ " are bight "+colour+" colour");
    }

    @Override
    public void getFruits(String name) {
        System.out.println("A jug of "+this.name+" juice for "+name);
    }

}
