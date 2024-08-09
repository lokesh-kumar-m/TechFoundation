package Structural.facade;

import java.util.List;

public class Additives implements Coffee{

    private boolean flag;
    private String addon;

    public Additives(List<String> lst){
        this.flag=lst.get(0).equalsIgnoreCase("false")?false:true;
        if(lst.size()>1){
            this.addon=lst.get(1);
        }
    }
    @Override
    public String dailyDoseOfEnery() {
        if(!flag){
            return "";
        }else{
            return addon.equalsIgnoreCase("cold")?"Ice":"sugar";
        }
    }
    
}
