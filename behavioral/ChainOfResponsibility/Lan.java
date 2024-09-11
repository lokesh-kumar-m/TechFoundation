package behavioral.ChainOfResponsibility;

public class Lan extends RequestHandler {

    @Override
    public boolean parseRequest(Packet packet) {
       String destination=packet.getDestinationAddress();
       int address= Integer.parseInt(destination.substring(0, destination.indexOf('.')));
       return address>170 && address<190;
    }
    
}
