package SOLID.SingleResponsibility;

import java.util.List;

public class Logger {
    
    public void recordLogger(List<Person> userLst){
        for (Person person : userLst) {
            System.out.println(person.getLendings());
        }
    }

    public void messageLogger(String message){
        System.out.println(message);
    }
}
