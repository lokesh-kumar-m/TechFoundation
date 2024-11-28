package SOLID.SingleResponsibility;

import java.util.List;

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
}
