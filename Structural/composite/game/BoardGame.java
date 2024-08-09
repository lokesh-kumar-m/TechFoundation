package Structural.composite.game;

public class BoardGame extends Game {

    public BoardGame(String name, int time) {
        super(name, time);
    }

    @Override
    public int occupatingTime() {
        return getTime()*2;
    }
    
}
