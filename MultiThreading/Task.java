package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task {
    private String projectName;
    private String taskId;
    private Lock lock;
    private boolean isCompleted;

    public Task(String name,String id){
        projectName=name;
        taskId=id;
        lock=new ReentrantLock();
        isCompleted=false;
    }
    public Lock getLock(){
        return lock;
    }
    public String getTaskId(){
        return taskId;
    }
    public boolean status(){
        return isCompleted;
    }
    public void completeTask(){
        isCompleted=true;
    }
    public String getProjectName(){
        return projectName;
    }
}
