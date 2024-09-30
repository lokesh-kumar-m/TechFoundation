package SOLID.InterfaceSegregation;

import SOLID.InterfaceSegregation.Interfaces.IfruitsAndVeggies;
import SOLID.InterfaceSegregation.Interfaces.IGroceries;

public class Willys implements IfruitsAndVeggies, IGroceries {

    @Override
    public void spices() {
        System.out.println("Salt");
        System.out.println("chilli powder");
    }

    @Override
    public void snacks() {
        System.out.println("Chips");
        System.out.println("chocolates");
    }

    @Override
    public void fruits() {
        System.out.println("melon");
        System.out.println("berries");
    }

    @Override
    public void veggies() {
        System.out.println("Broccoli");
        System.out.println("Spinach");
    }
    
}
