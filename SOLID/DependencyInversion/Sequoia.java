package SOLID.DependencyInversion;

public class Sequoia implements IVersion{

    @Override
    public void getInfo() {
        System.out.println("MacOs 15.0");
        System.out.println("Released in fall 2024");
    }

    @Override
    public void getFeatures() {
        System.out.println("Apple intelligence");
        System.out.println("iPhone mirroring");
        System.out.println("New Text editing and image playground");
        System.out.println("Improved siri response");
    }
    
}
