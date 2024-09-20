package behavioral.State.States;

import java.util.ArrayList;
import java.util.List;

import behavioral.State.Person;

public class ProcessState implements GateState{

    private Person person;
    private List<String> users =new ArrayList<>();

    public ProcessState(Person person){
        this.person=person;
    }

    @Override
    public boolean execute() {
        if(person.getAuth()){
            System.out.println("Already Verified! Please exit");
        }
        if(users.contains(person.getName()) && person.getId()!= null ){
            person.setAuth();
        }
        else if(users.contains(person.getName()) &&person.getId() ==null ){
            removeUser();
        }
        else{
            if(person.getId()!=null){
                System.out.println("Registering new User");
                registerUser();
                execute();
            }
        }
        return person.getAuth();
    }
    
    private void registerUser(){
        users.add(person.getName());
    }
    private void removeUser(){
        users.remove(person.getName());
    }
}
