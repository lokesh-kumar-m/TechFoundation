package SOLID.SingleResponsibility;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitCalculator {
    private Logger log=new Logger();

    // Method to calculate an equal split of a given amount among a list of people.
    public double equalSplit(List<Person> personLst, double amount){
        int friendsCount=personLst.size();
        if(friendsCount==0){
            return 0;
        }
        //log is used to print the following message
        log.messageLogger("The following people "+personLst+" made a bill of "+amount); 
        return amount/friendsCount;
    }
    // Similarly unequal split given a map of user name, percentage returns a map that contain the user name and their share
    public HashMap<String,Double> unequalSplit(HashMap<String, Integer> splits, double amount){
        HashMap<String, Double> splitresult=new HashMap<>();
        for( Map.Entry<String,Integer> rec: splits.entrySet() ){
            splitresult.put(rec.getKey(),amount*rec.getValue()/100);
        }
        return splitresult;
    }
}
