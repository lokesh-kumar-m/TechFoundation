package creational.AbstractFactory.Factories;

import creational.AbstractFactory.FLowerPlant;
import creational.AbstractFactory.FruitPlant;
import creational.AbstractFactory.WeedPlant;
import creational.AbstractFactory.Plants.Cranberry;
import creational.AbstractFactory.Plants.Hyacinth;
import creational.AbstractFactory.Plants.Lotus;
import creational.AbstractFactory.Plants.SeaWeed;
import creational.AbstractFactory.Plants.Strawberry;
import creational.AbstractFactory.Plants.WaterLily;

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
