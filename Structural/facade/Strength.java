package Structural.facade;

public class Strength implements Coffee{

    private int count;

    public Strength(String strength){
        if(strength.equalsIgnoreCase("strong")){
            this.count=30;
        }
        else if(strength.equalsIgnoreCase("medium")){
            this.count=15;
        }
        else{
            this.count=9;
        }
    }

    @Override
    public String dailyDoseOfEnery() {
        return count>15?"Strong":"moderate or light";
    }
    
}
