package behavioral.Strategy.GPU;

public class AMD implements GPU{

    @Override
    public void add() {
        String name=this.getClass().getSimpleName()+" "+Model();
        System.out.println("Adding "+name+" with inbuilt AI "+AI()+ " and a VRAM of "+vRam() );
    }
    private String Model(){
        return "RX 7900 XTX";
    }
    private String AI(){
        return "192";
    }
    private String vRam(){
        return "24 GB";
    }
    
}
