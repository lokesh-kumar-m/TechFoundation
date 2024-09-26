package SOLID.Open_Closed;

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
