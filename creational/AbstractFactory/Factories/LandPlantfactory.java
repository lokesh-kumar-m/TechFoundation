package creational.AbstractFactory.Factories;

import creational.AbstractFactory.FLowerPlant;
import creational.AbstractFactory.FruitPlant;
import creational.AbstractFactory.WeedPlant;
import creational.AbstractFactory.Plants.Daisy;
import creational.AbstractFactory.Plants.Dandelion;
import creational.AbstractFactory.Plants.JackFruit;
import creational.AbstractFactory.Plants.Mango;
import creational.AbstractFactory.Plants.PoisionIvy;
import creational.AbstractFactory.Plants.Rose;

public class LandPlantfactory implements PlantFactory {

    @Override
    public FLowerPlant createFlowerPlant(String pattern) {
        if(pattern.equalsIgnoreCase("reflexed")){
            return new Rose();
       }
       else if(pattern.equalsIgnoreCase("rosette")){
            return new Daisy();
       }else{
            throw new IllegalArgumentException("Invalid pattern");
       }
    }

    @Override
    public FruitPlant createFruitPlant(Object... args) {
         if(args[0] instanceof Integer){
            return new Mango();
       }else if(args[0] instanceof String){
            return new JackFruit();
       }else{
            throw new IllegalArgumentException("invalid seed type");
       }
    }

    @Override
    public WeedPlant createWeedPlant(boolean harmful) {
       if(harmful){
            return new PoisionIvy();
       }else{
            return new Dandelion();
       }
    }

    
    
}
