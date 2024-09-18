package behavioral.Strategy.Processors;

public class AMD_R_7900 implements Processor{

    @Override
    public void add() {
        String name= this.getClass().getSimpleName();
        System.out.println("Adding "+name+"with "+cores()+" cores and "+freq()+" Max Frequency");
    }
    
    private int cores(){
        return 12;
    }
    private String freq(){
        return "5.4 GHz";
    }
}
