package SOLID.SingleResponsibility;

import java.util.List;

public class App {
    
    public static void main(String[] args) {
        Logger log=new Logger();
        UserCreator creator=new UserCreator();
        // Creates a list of Person objects from a comma-separated string of names
        List<Person> friends= creator.createUsers("rore,bhsa,sakn");

        SplitCalculator splicalculator =new SplitCalculator(log);
        double splitAmount=splicalculator.equalSplit(friends, 2500);

        SplitManager splitManage=new SplitManager("lome");
        for (Person frnd : friends) {
            splitManage.addNewDet(frnd, splitAmount); 
        }

        
        log.recordLogger(friends);

    }
}
