package behavioral.Observer.Observable;

import behavioral.Observer.Observers.Observer;

public interface Observable {
    public void register(Observer observer);
    public void unregister(Observer observer);
    public void inform();
    public String getResult(String name);
}
