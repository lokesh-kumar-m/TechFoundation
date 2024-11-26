package SOLID.SingleResponsibility;

import java.util.ArrayList;
import java.util.List;

public class UserCreator {
    public List<Person> createUsers(String names) {
        String[] namesArray=names.split(",");
        List<Person> friends = new ArrayList<>();
        for (String name : namesArray) {
            friends.add(new Person(name));
        }
        return friends;
    }
}
