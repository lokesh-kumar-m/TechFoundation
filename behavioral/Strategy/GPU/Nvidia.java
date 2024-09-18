package behavioral.Strategy.GPU;

public class Nvidia implements GPU{

    @Override
    public void add() {
        String name=this.getClass().getSimpleName()+" "+Model();
        System.out.println("Adding "+name+" with inbuilt AI "+AI()+ " and a VRAM of "+vRam() );
        System.out.println("Consumes "+pConsumption()+" power");
    }
    private String Model(){
        return "RTX 4090";
    }
    private String AI(){
        return "4th GEN 1321 AI TOPs";
    }
    private String pConsumption(){
        return "low";
    }
    private String vRam(){
        return "24 GB";
    }
    
}
