package behavioral.Mediator.Clients;

import java.util.HashMap;

import behavioral.Mediator.Mediator;

public interface Client {
    public void setMediator(Mediator mediator);
    public void visit();
    public void buy();
    public HashMap<String, String> info();
}
