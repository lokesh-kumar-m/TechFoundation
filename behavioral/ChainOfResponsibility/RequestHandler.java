package behavioral.ChainOfResponsibility;

public abstract class RequestHandler {
    private RequestHandler nextHandler;

    public void setNextHandler(RequestHandler handler){
        this.nextHandler=handler;
    }

    public void checkRequest(Packet packet){
        if(parseRequest(packet) && nextHandler!=null){
            System.out.println( this.getClass().getSimpleName() + " contains the destination address");
            nextHandler.checkRequest(packet);
        }
        else{
            System.out.println("Address not found");
        }
    }
    public abstract boolean parseRequest(Packet packet);
}
