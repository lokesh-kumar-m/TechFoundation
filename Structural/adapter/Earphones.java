package Structural.adapter;

//first client that can communicate with phone(service) 

public class Earphones implements AudioImpl {

    private String connector;

    public Earphones(){
        this.connector="TypeC";
    }

    @Override
    public void audioConvertion() {
        System.out.println("inbuilt DAC impl");
    }

    public String getDac(){
        return connector;
    }
    
}
