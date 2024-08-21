package Structural.decorator;

public class LaptopImpl implements Laptop {

    private String type;
    public LaptopImpl(String type){
        this.type=type;
    }

    @Override
    public String workStation() {
        return type+" setup";
    }

    public String type(){
        return type;
    }
    
}
