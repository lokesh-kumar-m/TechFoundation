package behavioral.Mediator.Clients;

import java.util.HashMap;

import behavioral.Mediator.Mediator;

public class ClientB implements Client{
    private Mediator mediator;
    private String moveIn;
    private String role;
    private String status;

    public ClientB(String movein, String role,String status){
        this.moveIn=movein;
        this.role=role;
        this.status=status;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator= mediator;
    }

    @Override
    public void visit() {
        mediator.bookVisit();
    }

    @Override
    public void buy() {
        mediator.buy();
    }

    @Override
    public HashMap<String, String> info() {
        HashMap<String,String> map=new HashMap<>();
        map.put("name", this.getClass().getSimpleName());
        map.put("role", role);
        map.put("movein", moveIn);
        map.put("status", status);
        return map;
    }
    
}
