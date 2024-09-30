package SOLID.InterfaceSegregation;

import SOLID.InterfaceSegregation.Interfaces.IDecorationAndLighting;
import SOLID.InterfaceSegregation.Interfaces.IElectronicaAndHardware;
import SOLID.InterfaceSegregation.Interfaces.IFurniture;
import SOLID.InterfaceSegregation.Interfaces.IHomeTextiles;

public class Ikea implements IFurniture, IHomeTextiles, IElectronicaAndHardware, IDecorationAndLighting {

    @Override
    public void lightpoles() {
        System.out.println("Desk lamp");
    }

    @Override
    public void gardenDecorLights() {
        System.out.println("pendant lamp");
    }

    @Override
    public void oven() {
        System.out.println("forced air oven");
    }

    @Override
    public void Tv() {
        System.out.println("big TV");
    }

    @Override
    public void carpet() {
        System.out.println("Floor carpet");
    }

    @Override
    public void clothings() {
       System.out.println("Children clothes");
    }

    @Override
    public void wardrobe() {
        System.out.println("Kitchen wardrobe");
        System.out.println("Bedroom wardrobe");
    }

    @Override
    public void beds() {
        System.out.println("king size bed");
    }

    @Override
    public void tables() {
        System.out.println("study table");
        System.out.println("dining table");
    }
    
}
