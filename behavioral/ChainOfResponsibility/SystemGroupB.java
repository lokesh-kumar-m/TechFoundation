package behavioral.ChainOfResponsibility;

public class SystemGroupB extends RequestHandler{
    
    @Override
    public boolean parseRequest(Packet packet) {
        String des= packet.getDestinationAddress();
        for(int i=0;i<2;i++){
            des=des.substring(des.indexOf('.')+1,des.length());
        }
        int address= Integer.parseInt(des.substring(0,des.indexOf('.')));
        return address>5 && address< 10;
    }
}
