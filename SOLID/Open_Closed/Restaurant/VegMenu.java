<<<<<<< HEAD:SOLID/Open_Closed/Menu/VegMenu.java
package SOLID.Open_Closed.Menu;
=======
package SOLID.Open_Closed.Restaurant;
>>>>>>> 81e3c520bf9adf36a40d90bc0c664c4a098764c0:SOLID/Open_Closed/Restaurant/VegMenu.java

import java.util.ArrayList;
import java.util.List;

public class VegMenu extends Menu{
    private List<String> items=new ArrayList<>();
    @Override
    public void menu() {
        items.add("panner Curry");
        items.add("dal Curry");
        items.add("mixed veg Curry");
        items.add("veg biryani");
        items.add("matar pulao");
        System.out.println("Here are our Vegetarian options, Please choose your order");
        for (String item : items) {
            System.out.println(item);
        }
    }
    
}
