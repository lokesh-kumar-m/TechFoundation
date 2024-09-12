package behavioral.ChainOfResponsibility.Handlers;

import behavioral.ChainOfResponsibility.Packet;
import behavioral.ChainOfResponsibility.RequestHandler;

public class Lan extends RequestHandler {

    @Override
    public boolean parseRequest(Packet packet, boolean impl) {
       String destination=packet.getDestinationAddress();
       int address= Integer.parseInt(destination.substring(0, destination.indexOf('.')));
       return address>170 && address<190;
    }
    
}
