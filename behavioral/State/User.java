package behavioral.State;

public class User {
    public static void main(String[] args) {
        Person person=new Person("lome", "Int0111");
        StateManager manager=new StateManager(person);
        manager.execute();

        manager.setState("wait");
        if(manager.execute()){
            manager.setState("open");
            manager.execute();
        }
        manager.execute();
    }
}
