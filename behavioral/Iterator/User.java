package behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class User {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Get milk", 10));
        tasks.add(new Task("Throw Trash", 5));
        tasks.add(new Task("Complete Iterator DP", 10));

        ListIterable iterable =new ConcreteIterable(tasks);
        TaskIterator iterator = iterable.createNewIterable();
        
        System.out.println(iterator.getCurrent().getData());
        System.out.println(iterator.getCurrent().getData());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.getCurrent().getData());
        
    }
}
