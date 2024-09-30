package SOLID.InterfaceSegregation;

import SOLID.InterfaceSegregation.Interfaces.IDecorationAndLighting;
import SOLID.InterfaceSegregation.Interfaces.IElectronicaAndHardware;
import SOLID.InterfaceSegregation.Interfaces.IGroceries;

public class Rusta implements IGroceries, IElectronicaAndHardware, IDecorationAndLighting {

    @Override
    public void lightpoles() {
        System.out.println("Study lamp");
    }

    @Override
    public void gardenDecorLights() {
        System.out.println("Christmas Lights");
    }

    @Override
    public void oven() {
        System.out.println("Ovens");
    }

    @Override
    public void Tv() {
        System.out.println("Big TV");
    }

    @Override
    public void spices() {
        System.out.println("Salt");
    }

    @Override
    public void snacks() {
        System.out.println("protien bars");
    }
    
}
