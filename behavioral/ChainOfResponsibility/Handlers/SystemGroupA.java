package behavioral.ChainOfResponsibility.Handlers;

import behavioral.ChainOfResponsibility.Packet;
import behavioral.ChainOfResponsibility.RequestHandler;

public class SystemGroupA extends RequestHandler{

    @Override
    public boolean parseRequest(Packet packet, boolean impl) {
        String des= packet.getDestinationAddress();
        for(int i=0;i<2;i++){
            des=des.substring(des.indexOf('.')+1,des.length());
        }
        int address= Integer.parseInt(des.substring(0,des.indexOf('.')));
        boolean ack=address>=0 && address<=5;
        if(impl){
            if(ack){ 
                System.out.println("Message recieved:"+packet.getData());
                System.out.println("Sending Reply");
            }
        }
        return ack;
    }
    
}
