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

        Introduction introduce=new Introduction();
        introduce.intro(manager);
        introduce.intro(srDeveloper);
        introduce.intro(jrDeveloper);
        introduce.intro(tester);
    }
}
