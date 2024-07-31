package creational.factory;

import java.util.List;

public class WaterBottle implements Bottle{

    private List<String> info;
    private String contents;
    
    public WaterBottle(String contents, List<String> lst){
        this.contents=contents;
        this.info=lst;
    }
    
    @Override
    public void fill() {
        System.out.println("Filling "+contents+"....");
    }

    @Override
    public void description() {
        System.out.println("material: "+info.get(0));
        System.out.println("temperature: "+info.get(1));
        System.out.println("bottle type: "+info.get(2));
        System.out.println("bottle size: "+info.get(3));
    }
    
}
