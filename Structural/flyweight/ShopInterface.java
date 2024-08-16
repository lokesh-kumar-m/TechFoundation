package Structural.flyweight;

public class ShopInterface {
    public static void main(String[] args) {
        Store store=new Store();
        store.addProduct("Ceramic Modern Plate", getprice(100), "Plate", "Home Essentials", "Ikea");
        store.addProduct("Fork Set", getprice(10), "Fork", "Home Essentials", "Ikea");
        store.addProduct("Glossy flyweight opaque plate", getprice(100), "Plate", "Home Essentials", "Ikea");
        store.addProduct("Brimnes", getprice(500), "Wardrobe", "Storage", "Ikea");

        store.getAllProducts();
    }

    private static long getprice(int num){
        double temp=Math.random()*num;
        long price=Math.round(temp);
        return price;
    }
}
