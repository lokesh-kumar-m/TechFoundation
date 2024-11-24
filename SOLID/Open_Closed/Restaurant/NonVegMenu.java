<<<<<<< HEAD:SOLID/Open_Closed/Menu/NonVegMenu.java
package SOLID.Open_Closed.Menu;
=======
package SOLID.Open_Closed.Restaurant;
>>>>>>> 81e3c520bf9adf36a40d90bc0c664c4a098764c0:SOLID/Open_Closed/Restaurant/NonVegMenu.java

import java.util.ArrayList;
import java.util.List;

public class NonVegMenu extends Menu{
    private List<String> items=new ArrayList<>();
    @Override
    public void menu() {
        items.add("Chicken Curry");
        items.add("Mutton Curry");
        items.add("Fish Curry");
        items.add("Chicken biryani");
        items.add("prawn biryani");
        System.out.println("Here are our Non-Vegetarian options, Please choose your order");
        for (String item : items) {
            System.out.println(item);
        }
    }
    
}
