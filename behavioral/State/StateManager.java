package behavioral.State;

import behavioral.State.States.ClosedState;
import behavioral.State.States.GateState;
import behavioral.State.States.OpenState;
import behavioral.State.States.ProcessState;

public class StateManager {
    private GateState authstate;
    private Person person;
    public StateManager(Person person){
        this.person=person;
        authstate=new ClosedState(person);
    }

    public void setState(String state){
        if(state.equalsIgnoreCase("closed")){
            authstate=new ClosedState(person);
        }
        else if(state.equalsIgnoreCase("wait")){
            authstate=new ProcessState(person);
        }else{
            authstate=new OpenState(person);
        }
    }

    public boolean execute(){
        return authstate.execute();
    }

    public void executeRemove(){
        person.setId();
    }
}
