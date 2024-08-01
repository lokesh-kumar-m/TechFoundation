package creational.AbstractFactory.Plants;

import creational.AbstractFactory.FLowerPlant;

public class Daisy implements FLowerPlant {

    private String name;
    private String family;
    private String flowerColour;

    public Daisy(){
        this.name="Daisy";
        this.family="Asteraceae";
        this.flowerColour="Multiple colours";
    }

    @Override
    public void getDescription() {
        System.out.println(name+" are a species of FLowering plants belongig to family: "+family);
        System.out.println("These consists of 15-30 petals surrounding a center pollens. These are available in "+flowerColour);
    }

    @Override
    public void getFlowers(String name) {
        System.out.println("A"+this.name+" crown for "+name);
    }

}
