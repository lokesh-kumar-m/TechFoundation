package behavioral.Iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ConcreteTaskIterator implements TaskIterator {

    private List<Task> taskList;
    private int currentIndx=0;

    public ConcreteTaskIterator(List<Task> lst){
        this.taskList = lst;
    }

    @Override
    public boolean hasNext() {
        return currentIndx < taskList.size();
    }

    @Override
    public Task getCurrent() {
        if(hasNext()){
            return taskList.get(currentIndx++);
        }else{
            throw new NoSuchElementException();
        }
    }

    @Override
    public void reset() {
        currentIndx =0;
    }
    
}
