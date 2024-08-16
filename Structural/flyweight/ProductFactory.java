package Structural.flyweight;

import java.util.HashMap;

public class ProductFactory {
    private static HashMap<String, Details> inventory=new HashMap<>();

    public static Details getInventoryDetails(String type, String category, String brand){
        if(!inventory.containsKey(type)){
            inventory.put(type, new Details(type, category, brand));
        }
        return inventory.get(type);
    }
}
