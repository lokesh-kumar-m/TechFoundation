package behavioral.Mediator;

import behavioral.Mediator.Clients.Client;

public interface Mediator {
    public void registerClient(Client client);
    public void bookVisit();
    public void buy();
    public void viewInformation();
    public void createPost(String name, int cost);
    public void removePost();
}
