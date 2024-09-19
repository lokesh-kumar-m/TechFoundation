package behavioral.Observer.Observers;

import behavioral.Observer.Observable.Observable;

public class Student implements Observer{

    private Observable canvas;
    private String name;
    private boolean assignment;

    public Student(Observable canvas){
        this.canvas=canvas;
    }

    @Override
    public void update() {
        System.out.println("The results are out "+name+" and here's your result:");
        System.out.println(canvas.getResult(name));
    }
    
    public boolean getAssignemnt(){
        return assignment;
    }
    public String getName(){
        return name;
    }
    public void setAssignment(boolean flag){
        this.assignment=flag;
    }
    public void setName(String name){
        this.name=name;
    }
    
}
