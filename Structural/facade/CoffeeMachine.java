package Structural.facade;

import java.util.ArrayList;
import java.util.Arrays;

public class CoffeeMachine {
    public static void main(String[] args) {
        CoffeFacade facade=new CoffeFacade();
        facade.createCoffe(new ArrayList<String>(Arrays.asList("light","milk","false")));
        facade.createCoffe(new ArrayList<>(Arrays.asList("strong","cream","true","sweet")));
    }
}
