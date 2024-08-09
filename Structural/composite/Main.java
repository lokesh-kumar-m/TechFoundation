package Structural.composite;

import Structural.composite.game.ArcadeGame;
import Structural.composite.game.BoardGame;

public class Main {
    public static void main(String[] args) {
        TimeKeeper timeKeeper=new TimeKeeper();
        timeKeeper.keeper(
            new CompositeRoom(new ArcadeGame("duckhunt", 10)),
            new CompositeRoom(new CompositeRoom(
                new BoardGame("chess", 20),
                new BoardGame("chekkers", 15),
                new ArcadeGame("car race", 10)
            ),
                new ArcadeGame("mario", 25),
                new ArcadeGame("counter strike", 30),
                new BoardGame("snakeNladder", 10)
            )
        );

        System.out.println(timeKeeper.occupatingTime());
    }
}
