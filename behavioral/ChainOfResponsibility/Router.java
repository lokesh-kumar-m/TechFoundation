package behavioral.ChainOfResponsibility;

public class Router extends RequestHandler{

    @Override
    public boolean parseRequest(Packet packet) {
       String destination=packet.getDestinationAddress();
       int firstOccurance=destination.indexOf('.');
       int address= Integer.parseInt(destination.substring(firstOccurance+1, destination.indexOf('.',firstOccurance+1)));
       return address>0 && address<5;
    }
    
}
