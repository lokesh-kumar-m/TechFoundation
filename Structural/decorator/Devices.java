package Structural.decorator;

public abstract class Devices implements Laptop{
    private Laptop laptop;

    public Devices(Laptop laptop){
        this.laptop=laptop;
    }

    public String workStation(){
        return laptop.workStation();
    }

    public String type(){
        return laptop.type();
    }
}
