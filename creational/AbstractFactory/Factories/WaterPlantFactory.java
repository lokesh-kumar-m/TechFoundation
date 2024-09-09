package creational.AbstractFactory.Factories;

import creational.AbstractFactory.Factories.FactoryInterface.PlantFactory;
import creational.AbstractFactory.PlantsImpl.Cranberry;
import creational.AbstractFactory.PlantsImpl.Hyacinth;
import creational.AbstractFactory.PlantsImpl.Lotus;
import creational.AbstractFactory.PlantsImpl.SeaWeed;
import creational.AbstractFactory.PlantsImpl.Strawberry;
import creational.AbstractFactory.PlantsImpl.WaterLily;
import creational.AbstractFactory.PlantsInterface.FLowerPlant;
import creational.AbstractFactory.PlantsInterface.FruitPlant;
import creational.AbstractFactory.PlantsInterface.WeedPlant;

public class WaterPlantFactory implements PlantFactory {

    @Override
    public FLowerPlant createFlowerPlant(String pattern) {
        if(pattern.equalsIgnoreCase("pointed")){
            return new WaterLily();
       }
       else if(pattern.equalsIgnoreCase("round")){
            return new Lotus();
       }else{
            throw new IllegalArgumentException("Invalid pattern");
       }
    }

    @Override
    public FruitPlant createFruitPlant(Object... args) {
        String family=(String)args[0];
        if(family.equalsIgnoreCase("rosaceae")){
            return new Strawberry();
       }else if(family.equalsIgnoreCase("ericaceae")){
            return new Cranberry();
       }else{
            throw new IllegalArgumentException("invalid seed type");
       }
    }

    @Override
    public WeedPlant createWeedPlant(boolean edible) {
       if(edible){
            return new SeaWeed();
       }else{
            return new Hyacinth();
       }
    }
    
}
