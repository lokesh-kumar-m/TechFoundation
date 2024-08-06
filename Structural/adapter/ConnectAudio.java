package Structural.adapter;

public class ConnectAudio {    

    public static void main(String[] args) {
        AudioImpl earphones=new Earphones();
        Phone connectAudio1=new Phone( earphones);
        connectAudio1.deviceConnection();

        Headset headset=new Headset();
        HeadsetAdapter adapter=new HeadsetAdapter(headset);
        Phone connectAudio2=new Phone(adapter);
        connectAudio2.deviceConnection();
        
    }
}
