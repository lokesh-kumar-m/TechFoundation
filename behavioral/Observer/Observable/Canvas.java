package behavioral.Observer.Observable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import behavioral.Observer.Observers.Observer;

public class Canvas implements Observable{

    private List<Observer> myStudents;
    private HashMap<String, String> resultmap;

    public Canvas(){
        myStudents=new ArrayList<>();
        resultmap=new HashMap<>();
    }

    @Override
    public void register(Observer observer) {
        myStudents.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        myStudents.remove(observer);
    }

    @Override
    public void inform() {
        for (Observer student : myStudents) {
            student.update();
        }
    }

    @Override
    public String getResult(String name) {
       return resultmap.get(name);
    }

    public void setResults(HashMap<String, String> map) {
        resultmap=map;
        inform();
    }
    
}
