package Structural.composite.game;

public class ArcadeGame extends Game {

    public ArcadeGame(String name, int time){
        super(name,time);
    }

    @Override
    public int occupatingTime() {
        return getTime();
    }
    
}
