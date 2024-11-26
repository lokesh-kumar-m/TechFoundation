package SOLID.Liskov.example2;

import SOLID.Liskov.example2.Employe.IEmploye;

public class EmployeeOperations {

    public void intro(IEmploye employe){
        System.out.println(employe.employeeDetails());
    }
    public void promotion(IEmploye employe){
        employe.promote();
    }
}
