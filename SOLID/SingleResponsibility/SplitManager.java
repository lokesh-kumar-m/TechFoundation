package SOLID.SingleResponsibility;

import java.util.HashMap;

public class SplitManager {
    private String currentUser;

    public SplitManager(String currentUser) {
        this.currentUser = currentUser;
    }

    public double getAmountOwed(Person friend){
        return friend.getLendings().getOrDefault(currentUser, 0.0);
    }

    public void addNewDet(Person friend, double amnt){
        HashMap<String, Double> update=friend.getLendings();
        update.put(currentUser, update.getOrDefault(currentUser, 0.0)+amnt );
        friend.setLendings(update);
    }

}
