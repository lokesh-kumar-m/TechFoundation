package creational.factory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Add enums, interface segrigation. custom inputs

        List<String> list=new ArrayList<>();
        list.add("plastic");
        list.add("cold");
        list.add("sipper");
        list.add("2 liter");
        BottleFactory factory=new BottleFactory();
        Bottle waterBottle=factory.createBottle("water", list);
        waterBottle.fill();
        waterBottle.description();

        list=new ArrayList<>();
        list.add("metal");
        list.add("hot");
        list.add("cap");
        list.add("1 liter");
        Bottle bottle=factory.createBottle("coffee", list);
        bottle.fill();
        bottle.description();
    }
}
