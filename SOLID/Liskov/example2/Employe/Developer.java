package SOLID.Liskov.example2.Employe;

public class Developer implements IEmploye{

    private String role="Software Developer";
    private String name;
    private int level;

    public Developer(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String employeeDetails() {
        return toString();    
    }

    @Override
    public String toString() {
        return "Developer [role=" + role + ", name=" + name + ", level=" + level + "]";
    }
    
}
