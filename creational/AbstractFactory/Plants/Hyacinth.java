package creational.AbstractFactory.Plants;

import creational.AbstractFactory.WeedPlant;

public class Hyacinth implements WeedPlant {

    private String name;
    private String color;
    private boolean Toxic;

    public Hyacinth(){
        this.name="Hyacinthus";
        this.color="purple/violet-blue";
        this.Toxic=true;
    }

    @Override
    public void getDescription() {
        System.out.println(name+" is a small genus of herbs and fragnat flowering plants. "+name+" belong to Asparagaceae family");
        System.out.println(name+" grow from bulb, each producing around four to six untoothed leaves and one to three spikes of flowers. These are available in "+color);
        System.out.println("Are "+name+" harmful?"+(Toxic?"Yes":"No"));
    }

    @Override
    public void getWeed(String name) {
       System.out.println(name+" gave me "+this.name+" a year ago. It's vibrant and beauty charmed me where I could not utter a word and my eyes failed to hold.");
    }


    

}
