package SOLID.SingleResponsibility;

import java.util.HashMap;

public class Person {
    private String name;
    private HashMap<String,Double> lendings;

    public Person(String name){
        this.name=name;
        this.lendings=new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Double> getLendings() {
        return lendings;
    }

    public void setLendings(HashMap<String, Double> lendings) {
        this.lendings = lendings;
    }
    
}
