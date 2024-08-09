package Structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeRoom implements Room {

    private List<Room> childRoom=new ArrayList<>();

    public CompositeRoom(Room... rooms){
        childRoom.addAll(Arrays.asList(rooms));
    }

    @Override
    public int occupatingTime() {
       return childRoom.stream().mapToInt(Room::occupatingTime).sum();
    }
    
}
