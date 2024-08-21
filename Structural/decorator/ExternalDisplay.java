package Structural.decorator;

public class ExternalDisplay extends Devices{

    public ExternalDisplay(Laptop laptop) {
        super(laptop);
    }

    public String workStation(){
        String displays=super.type().equalsIgnoreCase("work")? "2 external monitors": "Single oled ultra def monitor";
        return super.workStation()+" use extended displays:"+displays;
    }
    
}
