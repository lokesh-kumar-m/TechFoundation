package behavioral.Strategy.Processors;

public class Intel_Core_i9 implements Processor{

    @Override
    public void add() {
        String name= this.getClass().getSimpleName()+ " "+model();
        System.out.println("Adding "+name+"with "+cores()+" cores and "+freq()+" Max Frequency");
    }
    
    private String model(){
        return "14901TE";
    }

    private int cores(){
        return 8;
    }
    private String freq(){
        return "5.5 GHz";
    }
}
