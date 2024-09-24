package SOLID.SingleResponsibility;

import java.util.HashMap;

public class Manage {
    public double getFriendDet(Person friend,String me){
        return friend.getLendings().get(me);
    }

    public void addNewDet(Person friend, String me, double amnt){
        
        HashMap<String, Double> update=friend.getLendings();
        update.put(me, update.getOrDefault(me, 0.0)+amnt );
        setamount(friend, update);
    }

    public void setamount(Person friend, HashMap<String, Double> map){
        friend.setLendings(map);
    }

}
