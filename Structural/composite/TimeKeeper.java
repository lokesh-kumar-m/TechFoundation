package Structural.composite;

public class TimeKeeper {
    private Room room;

    public void keeper(Room... rooms){
        this.room=new CompositeRoom(rooms);
    }

    public int occupatingTime(){
        return room.occupatingTime();
    }
}
