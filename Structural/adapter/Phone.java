package Structural.adapter;

//Service phone of type C, which cannot be changed.

public class Phone {
    private String type="TypeC";
    private AudioImpl audioImpl;

    public Phone(AudioImpl audioImpl){
        this.audioImpl=audioImpl;
    }

    public void deviceConnection(){
        audioImpl.audioConvertion();
        if(audioImpl.getDac().equalsIgnoreCase(type)){
            System.out.println("Device connected and listening");
        }
    }
}
