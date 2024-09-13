package behavioral.Iterator;

import java.util.List;

public class ConcreteIterable implements ListIterable{
    private List<Task> lst;

    public ConcreteIterable(List<Task> lst){
        this.lst=lst;
    }
    @Override
    public TaskIterator createNewIterable() {
        return new ConcreteTaskIterator(lst);
    }
    
}
