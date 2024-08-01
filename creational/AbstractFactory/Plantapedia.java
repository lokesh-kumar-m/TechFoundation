package creational.AbstractFactory;

import creational.AbstractFactory.Factories.LandPlantfactory;
import creational.AbstractFactory.Factories.WaterPlantFactory;

public class Plantapedia {
    public static void main(String[] args) {
        LandPlantfactory landPlantfactory=new LandPlantfactory();
        WaterPlantFactory waterPlantFactory=new WaterPlantFactory();

        FLowerPlant fp1=landPlantfactory.createFlowerPlant("Reflexed");
        fp1.getDescription();
        fp1.getFlowers("robin");

        FLowerPlant fp2=landPlantfactory.createFlowerPlant("rosette");
        fp2.getDescription();
        fp2.getFlowers("rosa");

        FLowerPlant fp3=waterPlantFactory.createFlowerPlant("pointed");
        fp3.getDescription();
        fp3.getFlowers("robin");

        FLowerPlant fp4=waterPlantFactory.createFlowerPlant("round");
        fp4.getDescription();
        fp4.getFlowers("lome");

        FruitPlant fp5=landPlantfactory.createFruitPlant(1);
        fp5.getDescription();
        fp5.getFruits("rore");

        FruitPlant fp6=landPlantfactory.createFruitPlant("Many");
        fp6.getDescription();
        fp6.getFruits("bhsa");

        FruitPlant fp7=waterPlantFactory.createFruitPlant("rosaceae");
        fp7.getDescription();
        fp7.getFruits("riva");

        FruitPlant fp8=waterPlantFactory.createFruitPlant("ericaceae");
        fp8.getDescription();
        fp8.getFruits("rita");

        WeedPlant fp9=landPlantfactory.createWeedPlant(false);
        fp9.getDescription();
        fp9.getWeed("rach");

        WeedPlant fp10=landPlantfactory.createWeedPlant(true);
        fp10.getDescription();
        fp10.getWeed("ragi");

        WeedPlant fp11=waterPlantFactory.createWeedPlant(false);
        fp11.getDescription();

        WeedPlant fp12=waterPlantFactory.createWeedPlant(true);
        fp12.getDescription();
    }
}
