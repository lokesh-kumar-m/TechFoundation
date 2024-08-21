package Structural.decorator;

public class KeyBoardAndMouse extends Devices {

    public KeyBoardAndMouse(Laptop laptop) {
        super(laptop);
    }

    public String workStation(){
        String consoles=super.type().equalsIgnoreCase("work")? "use keyboard and mouse": "use game console";
        return super.workStation()+" "+consoles;
    }
    
}
