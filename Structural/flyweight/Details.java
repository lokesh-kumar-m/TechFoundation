package Structural.flyweight;

// their initial values are allocated only inside the constructor.

public class Details {
    private String type;
    private String category;
    private String brand;

    public Details(String type, String category, String brand) {
        this.type = type;
        this.category = category;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }
  
}
