package Structural.adapter;
//second client which cannot directly communicate with service. Incompatible client
public class Headset {

    private String audioType="analog";

    public void printDetails(){
        System.out.println("No inbuilt DAC impl");
    }

    public String send(){
        return audioType;
    }
    
}
