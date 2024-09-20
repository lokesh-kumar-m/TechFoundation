package behavioral.State.States;

import behavioral.State.Person;

public class ClosedState implements GateState{

    private Person person;

    public ClosedState(Person person){
        this.person=person;
    }
    
    @Override
    public boolean execute() {
        System.out.println("Gate is Closed!");
        if(person.getAuth()){
            person.setAuth();
        }
        return person.getAuth();
    }
    
}
