package SOLID.SingleResponsibility;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculateSplit {
    public double equalSplit(List<Person> lst, double amount){
        int people=lst.size();
        return amount/people;
    }
    public HashMap<String,Double> unequalSplit(HashMap<String, Integer> splits, double amount){
        HashMap<String, Double> splitresult=new HashMap<>();
        for( Map.Entry<String,Integer> rec: splits.entrySet() ){
            splitresult.put(rec.getKey(),amount*rec.getValue()/100);
        }
        return splitresult;
    }
}
