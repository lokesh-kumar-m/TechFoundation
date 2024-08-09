package Structural.facade;

public class Mixer implements Coffee{

    private String solvent;
    private Strength strength;

    public Mixer(String type, String solvent){
        this.strength=new Strength(type);
        this.solvent=solvent;
    }

    @Override
    public String dailyDoseOfEnery() {
        String result=strength.dailyDoseOfEnery();
        if(solvent.equalsIgnoreCase("water")){
            return result+=" decaution";
        }else if(solvent.equalsIgnoreCase("milk")){
            return result+=" Coffee with milk";
        }
        return result+" Coffee with creamy milk";
    }
    
}
