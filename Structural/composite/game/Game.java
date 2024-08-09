package Structural.composite.game;

import Structural.composite.Room;

public abstract class Game implements Room {
    private String name;
    private int time;

    public Game(String name, int time){
        this.name=name;
        this.time=time;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }

    
}
