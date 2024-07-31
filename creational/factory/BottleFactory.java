package creational.factory;

import java.util.List;

public class BottleFactory {
    public Bottle createBottle(String contents,List<String> lst){
        if(lst.size()>0&&lst.get(0).equalsIgnoreCase("plastic")){
            return new WaterBottle(contents, lst);
        }else if(lst.size()>0&&lst.get(0).equalsIgnoreCase("metal")){
            return new Flask(contents, lst);
        }else{
            throw new IllegalArgumentException("invalid bottle type");
        }
    }
}
