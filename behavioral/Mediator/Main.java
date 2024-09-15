package behavioral.Mediator;

import behavioral.Mediator.Clients.Client;
import behavioral.Mediator.Clients.ClientA;

public class Main {
    public static void main(String[] args) {
        Mediator mediator=new Contracter();
        mediator.createPost("Studio", 1300);
        Client client1=new ClientA("ASAP", "Dev", "single");
        client1.setMediator(mediator);
        Client client2=new ClientA("2Month", "Dev", "single");
        client2.setMediator(mediator);
        Client client3=new ClientA("Month", "Dev", "single");
        client3.setMediator(mediator);
        mediator.registerClient(client1);
        client1.visit();
        mediator.registerClient(client3);
        client3.visit();
        mediator.registerClient(client2);
        client2.visit();
        client2.visit();
        client3.buy();
    }
}
