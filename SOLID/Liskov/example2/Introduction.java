package SOLID.Liskov.example2;

import SOLID.Liskov.example2.Employe.IEmploye;

public class Introduction {

    public void intro(IEmploye employe){
        System.out.println(employe.employeeDetails());
    }

}
