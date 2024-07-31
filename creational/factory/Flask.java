package creational.factory;

import java.util.List;

public class Flask implements Bottle{

    private String content;
    private List<String> info;

    public Flask(String contents, List<String> lst){
        this.content=contents;
        this.info=lst;
    }

    @Override
    public void fill() {
      System.out.println("Filling "+content+"....");
    }

    @Override
    public void description() {
        System.out.println("material: "+info.get(0));
        System.out.println("temperature: "+info.get(1));
        System.out.println("bottle type: "+info.get(2));
        System.out.println("bottle size: "+info.get(3));
    }
    
}
