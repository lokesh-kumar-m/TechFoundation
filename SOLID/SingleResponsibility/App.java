package SOLID.SingleResponsibility;

import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        List<Person> friends= new ArrayList<>();
        Person friend1=new Person("rore");
        Person friend2=new Person("balu");
        Person friend3=new Person("vido");
        friends.add(friend1);
        friends.add(friend2);
        friends.add(friend3);

        CalculateSplit splicalculator =new CalculateSplit();
        Manage splitManage=new Manage();

        double splitAmount=splicalculator.equalSplit(friends, 2500);

        for (Person frnd : friends) {
            splitManage.addNewDet(frnd, "lome", splitAmount);   
        }
    }
}
