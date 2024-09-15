package behavioral.Mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import behavioral.Mediator.Clients.Client;


public class Contracter implements Mediator{
    private boolean visitor;
    private List<String> prop;
    private Client client1;
    private Client client2;
    private Client client3;
    private String name;
    private String movein;
    public Contracter(){
        this.prop=new ArrayList<>();
    }

    @Override
    public void registerClient(Client client){
        name=client.getClass().getSimpleName();
        if(name.equals("ClientA")){
            client1=client;
        }
        else if(name.equals("ClientB")){
            client2=client;
        }else{
            client3=client;
        }

    }

    @Override
    public void bookVisit() {
        if(!visitor){
            visitor=true;
            System.out.println("A visit has been arranged to "+name);
        }else{
            System.out.println("Please try after some time");
            resetVisit();
        }
    }

    @Override
    public void buy() {
        viewInformation();
        System.out.println(movein);
        if(movein!=null && movein.equals("ASAP")){
            System.out.println("The property has be sold to "+name);
            removePost();
        }
    }

    @Override
    public void viewInformation() {
        HashMap<String,String>infomap;
        if(name.equals("ClientA")){
            infomap=client1.info();
        }else if(name.equals("ClientB")){
            infomap=client2.info();
        }else{
            infomap=client3.info();
        }
        if(infomap.containsKey("movein")){
            movein=infomap.get("movein");
        }
    }

    @Override
    public void createPost(String name, int cost) {
        String tempStr="A new property "+name+"owned by a Contracter open for sale with price: "+cost;
        prop.add(tempStr);
    }

    @Override
    public void removePost() {
        prop.remove(0);
    }
    private void resetVisit(){
        visitor=false;
    }
    
}
