package creational.AbstractFactory.Factories;

import creational.AbstractFactory.Factories.FactoryInterface.PlantFactory;
import creational.AbstractFactory.PlantsImpl.Daisy;
import creational.AbstractFactory.PlantsImpl.Dandelion;
import creational.AbstractFactory.PlantsImpl.JackFruit;
import creational.AbstractFactory.PlantsImpl.Mango;
import creational.AbstractFactory.PlantsImpl.PoisionIvy;
import creational.AbstractFactory.PlantsImpl.Rose;
import creational.AbstractFactory.PlantsInterface.FLowerPlant;
import creational.AbstractFactory.PlantsInterface.FruitPlant;
import creational.AbstractFactory.PlantsInterface.WeedPlant;

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
