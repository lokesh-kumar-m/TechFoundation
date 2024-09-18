package behavioral.Strategy.Memory;

public class Klevv implements Memory{

    @Override
    public void insertAll() {
        System.out.println("Total size: " + size());
       for(int i=0;i<count();i++){
        System.out.println("inserting.."+(i+1)+config());
       }
    }

    private String size(){
        return "32 GB";
    }
    private String config(){
        return "16 GB";
    }
    private int count(){
        return 2;
    }
    
}
