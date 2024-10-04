package MultiThreading;

import java.util.List;
import java.util.concurrent.locks.Lock;

public class Developers implements Runnable {
    private List<Task> tasks;
    private String domain;
    private String name;

    public Developers(List<Task> tasks, String domain,String name){
        this.tasks=tasks;
        this.domain=domain;
        this.name=name;
    }

    @Override
    public void run() {
        for (Task task : tasks) {
            if(!task.status()){
                Lock lock=task.getLock();
                if(lock.tryLock()){
                    try {
                        if(task.getProjectName().contains(domain)){
                            try {
                                Thread.sleep(Math.round(Math.random()*10)*1000);
                            } catch (Exception e) {
                                new InterruptedException();
                            }
                            task.completeTask();
                            System.out.println(name+" completed task: " +task.getTaskId());
                        }else{
                            System.out.println(name+" skipped task: " +task.getTaskId());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }finally{
                        lock.unlock();
                    }
                }
            }   
        }
    }

}
