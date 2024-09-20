package behavioral.State.States;

import behavioral.State.Person;

public class OpenState implements GateState{

    private Person person;

    public OpenState(Person person){
        this.person=person;
    }

    @Override
    public boolean execute() {
        if(person.getAuth()){
            System.out.println(person.getName()+" is verfied employe. Please exit");
            person.setAuth();
        }else{
            System.out.println("Gate Closed");
        }
        return person.getAuth();
    }
    
}
