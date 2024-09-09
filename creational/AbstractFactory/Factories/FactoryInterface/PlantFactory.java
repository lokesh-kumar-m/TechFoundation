package creational.AbstractFactory.Factories.FactoryInterface;

import creational.AbstractFactory.PlantsInterface.FLowerPlant;
import creational.AbstractFactory.PlantsInterface.FruitPlant;
import creational.AbstractFactory.PlantsInterface.WeedPlant;

public interface PlantFactory {
    public FLowerPlant createFlowerPlant(String pattern);
    public FruitPlant createFruitPlant(Object... args);
    public WeedPlant createWeedPlant(boolean edible);
}
