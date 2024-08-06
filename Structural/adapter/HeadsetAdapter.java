package Structural.adapter;
//adapter to define a way for second client to communicate with service. It implements the client interface
public class HeadsetAdapter implements AudioImpl{

    private Headset headset;

    public HeadsetAdapter(Headset headset){
        this.headset=headset;
    }

    @Override
    public void audioConvertion() {
        headset.printDetails();
        System.out.println("External DAC impl to convert analog audio");
    }
    
    public String getDac(){
        String converter=headset.send().equalsIgnoreCase("analog")?"TypeC":"Invalid connector";
        return converter;
    }
}
