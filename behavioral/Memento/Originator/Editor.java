package behavioral.Memento.Originator;

import behavioral.Memento.Memento.SnapShot;

public class Editor{

    private String type;
    private int x;
    private int y;
    private String action;

    public SnapShot Save() {
        return new SnapShot(type,x,y,action);
    }  
    public void restore(SnapShot snap) {
        this.type=snap.getType();
        this.action=snap.getAction();
        this.x=snap.getX();
        this.y=snap.getY();  
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setAction(String action) {
        this.action = action;
    } 

    public String getType() {
        return type;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public String getAction() {
        return action;
    } 
}
