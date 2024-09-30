package SOLID.Liskov.example2.Employe;

public class Tester implements IEmploye{

    private String role="QA Testing";
    private String name;
    private int level;

    public Tester(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String employeeDetails() {
        return toString();    
    }

    @Override
    public String toString() {
        return "Testing [role=" + role + ", name=" + name + ", level=" + level + "]";
    }
    
}
