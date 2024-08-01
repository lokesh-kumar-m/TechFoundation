package creational.AbstractFactory.Factories;

import creational.AbstractFactory.FLowerPlant;
import creational.AbstractFactory.FruitPlant;
import creational.AbstractFactory.WeedPlant;

public interface PlantFactory {
    public FLowerPlant createFlowerPlant(String pattern);
    public FruitPlant createFruitPlant(Object... args);
    public WeedPlant createWeedPlant(boolean edible);
}
