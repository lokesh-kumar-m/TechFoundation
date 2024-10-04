package MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class Project {
    
    private List<Task> tasks=new ArrayList<>();
    private String name;

    public Project(String name, int count){
        this.name=name;
        for(int i=0;i<count;i++){
            String id=name.substring(0, 2)+i+name.substring(name.length()-2, name.length());
            tasks.add(new Task(name, id));
        }
    }
    public String getProjectName(){
        return name;
    }
    public List<Task> getTasks(){
        return tasks;
    }
}
