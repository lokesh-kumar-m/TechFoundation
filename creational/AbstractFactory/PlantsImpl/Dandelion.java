package creational.AbstractFactory.PlantsImpl;

import creational.AbstractFactory.PlantsInterface.WeedPlant;

public class Dandelion implements WeedPlant {

    private String name;
    private String family;

    public Dandelion() {
        this.name="Dandelions";
        this.family="Asteraceae";
    }

    @Override
    public void getDescription() {
        System.out.println("These are commonly known as"+name+" and are a species of flowering plants belongig to family: "+family);
        System.out.println("The flower fades downwards when the seeds mature, so that the seeds can be dispersed by wind.");
        System.out.println("There are multiple variants of the "+ name);
    }

    @Override
    public void getWeed(String name) {
        System.out.println(name+" is in a field of "+this.name);
    }
    

}
