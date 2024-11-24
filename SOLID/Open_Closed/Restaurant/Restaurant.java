<<<<<<< HEAD:SOLID/Open_Closed/Menu/Restaurant.java
package SOLID.Open_Closed.Menu;
=======
package SOLID.Open_Closed.Restaurant;
>>>>>>> 81e3c520bf9adf36a40d90bc0c664c4a098764c0:SOLID/Open_Closed/Restaurant/Restaurant.java

public class Restaurant {
    public static void main(String[] args) {
        Menu veg=new VegMenu();
        veg.menu();
        Menu nonveg=new NonVegMenu();
        nonveg.menu();
    }
}
