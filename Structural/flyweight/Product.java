package Structural.flyweight;

//Divide the class fields into intrinsic(unchanged data) and extrinsic(unique data) states

public class Product {
    private String name;
    private long price;
    private Details details;//intrinsic

    public Product(String name,long price, Details details){
        this.name=name;
        this.price=price;
        this.details=details;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public Details getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", details=" + details.getType() +" "+details.getCategory()+" "+details.getBrand()+ "]";
    }
    
}
