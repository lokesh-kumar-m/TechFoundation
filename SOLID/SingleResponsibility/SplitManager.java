package SOLID.SingleResponsibility;

import java.util.HashMap;

public class SplitManager {
    private String currentUser;
    // Constructor to initialize the SplitManager with the current user to get lendings of current user
    public SplitManager(String currentUser) {
        this.currentUser = currentUser;
    }
    //Return the debt of current user for a particular friend
    public double getAmountOwed(Person friend){
        return friend.getLendings().getOrDefault(currentUser, 0.0);
    }
    //Method to add a new debt entry for the current user with a specific friend.
    public void addNewDet(Person friend, double amnt){
        //If a person already contains some debt, get previous amount and add the current amount 
        HashMap<String, Double> update=friend.getLendings();
        update.put(currentUser, update.getOrDefault(currentUser, 0.0)+amnt );
        friend.setLendings(update);
    }

}
