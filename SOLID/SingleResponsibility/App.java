package SOLID.SingleResponsibility;

import java.util.List;

public class App {
    
    public static void main(String[] args) {
        UserCreator creator=new UserCreator();
        List<Person> friends= creator.createUsers("rore,bhsa,sakn");

        SplitCalculator splicalculator =new SplitCalculator();
        double splitAmount=splicalculator.equalSplit(friends, 2500);

        SplitManager splitManage=new SplitManager("lome");
        for (Person frnd : friends) {
            splitManage.addNewDet(frnd, splitAmount); 
        }
        
        Logger log=new Logger();
        log.recordLogger(friends);

    }
}
