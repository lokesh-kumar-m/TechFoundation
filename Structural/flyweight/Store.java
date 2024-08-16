package Structural.flyweight;

// for each product set the extrinsic and intrinsic fields using constructor.
// intrinsic data is accessed by requesting the factory method, if the data already exists the object is returned else new object is created. 

import java.util.ArrayList;

public class Store {
    private ArrayList<Product> items=new ArrayList<>();

    public void addProduct(String name,long price, String type, String category, String brand){
        Details productInfo=ProductFactory.getInventoryDetails(type,category,brand);
        items.add(new Product(name, price, productInfo));
    }

    public void getAllProducts(){
        for (Product prod : items) {
            System.out.println(prod.toString());
        }   
    }
}
