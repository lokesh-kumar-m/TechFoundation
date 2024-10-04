package MultiThreading;


public class Admin {
    
    public Project createTask(String name, int count){
        return new Project(name,count);
    }

}
