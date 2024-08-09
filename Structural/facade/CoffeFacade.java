package Structural.facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoffeFacade {
    public void createCoffe(List<String> lst){

        Coffee coffee=new Mixer(lst.get(0), lst.get(1));
        Additives additives;
        if(lst.get(2).equalsIgnoreCase("false")){
            additives=new Additives(new ArrayList<String>(Arrays.asList("false")));
        }else{
            additives=new Additives(new ArrayList<>(Arrays.asList(lst.get(2),lst.get(3))));
        }        
        System.out.println(coffee.dailyDoseOfEnery()+" "+additives.dailyDoseOfEnery());
    }
}