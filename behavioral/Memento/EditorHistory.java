package behavioral.Memento;

import java.util.Stack;

import behavioral.Memento.Memento.SnapShot;


public class EditorHistory {
    private Stack<SnapShot> history =new Stack<>();

    public void save(SnapShot memento){
        history.push(memento);
    }
    public void Current(){
        System.out.print(history.peek().getAction());
    }

    public SnapShot undo(){
        history.pop();
        return history.peek();
    }
}
