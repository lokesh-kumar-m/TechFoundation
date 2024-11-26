package SOLID.Liskov.example2.Employe;

public class Manager implements IEmploye{

    private String role="Associate Project Manager";
    private String name;
    private int level;

    public Manager(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String employeeDetails() {
        return toString();    
    }

    @Override
    public String toString() {
        return "Manager [role=" + role + ", name=" + name + ", level=" + level + "]";
    }

    @Override
    public void promote() {
        level=level+1;
        if(role.contains("Associate")){
            role=role.replace("Associate","");
        }
        if(role.equalsIgnoreCase("Project Manager")){
            role="Sr Project Manager";
        }
    }
    
}
