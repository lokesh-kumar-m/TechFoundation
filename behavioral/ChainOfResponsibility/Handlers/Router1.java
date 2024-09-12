package behavioral.ChainOfResponsibility.Handlers;

import behavioral.ChainOfResponsibility.Packet;
import behavioral.ChainOfResponsibility.RequestHandler;

public class Router1 extends RequestHandler{

    @Override
    public boolean parseRequest(Packet packet,boolean impl) {
       String destination=packet.getDestinationAddress();
       int firstOccurance=destination.indexOf('.');
       int address= Integer.parseInt(destination.substring(firstOccurance+1, destination.indexOf('.',firstOccurance+1)));
       return address>0 && address<5;
    }
    
}
