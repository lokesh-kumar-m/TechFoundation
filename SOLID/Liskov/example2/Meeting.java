package SOLID.Liskov.example2;

import SOLID.Liskov.example2.Employe.Developer;
import SOLID.Liskov.example2.Employe.IEmploye;
import SOLID.Liskov.example2.Employe.Manager;
import SOLID.Liskov.example2.Employe.Tester;

public class Meeting {
    public static void main(String[] args) {
        IEmploye manager=new Manager("Sourabh", 7);
        IEmploye srDeveloper= new Developer("Hardyal", 6);
        IEmploye jrDeveloper= new Developer("Harsh", 4);
        IEmploye tester=new Tester("Goldi", 5);

        EmployeeOperations employeeController=new EmployeeOperations();
        employeeController.intro(manager);
        employeeController.intro(srDeveloper);
        employeeController.intro(jrDeveloper);
        employeeController.intro(tester);

        employeeController.promotion(jrDeveloper);
        employeeController.promotion(manager);
        employeeController.intro(jrDeveloper);
        employeeController.intro(manager);
        
    }
}
