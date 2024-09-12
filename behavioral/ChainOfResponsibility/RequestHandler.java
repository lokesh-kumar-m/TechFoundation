package behavioral.ChainOfResponsibility;

public abstract class RequestHandler {
    private RequestHandler[] nextHandler=new RequestHandler[2];

    public void setNextHandler(RequestHandler handler, boolean flag){
        if(flag){
            this.nextHandler[0]=handler;
        }else{
            this.nextHandler[1]=handler;
        }
    }

    public void checkRequest(Packet packet){
        if(nextHandler.length!= 0){
            if(nextHandler[0]!=null){
                if(nextHandler[0].parseRequest(packet,false))
                    nextHandler[0].checkRequest(packet);   
            }
            if(nextHandler[1]!=null){
                if(nextHandler[1].parseRequest(packet,false))
                    nextHandler[1].checkRequest(packet);
            }
        }
        if(parseRequest(packet,true)){
            System.out.print( this.getClass().getSimpleName() + "-->");
        }
        else{
            System.out.println("Address not found");
        }
    }
    public abstract boolean parseRequest(Packet packet, boolean impl);
}
