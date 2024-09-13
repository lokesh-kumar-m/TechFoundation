package behavioral.Iterator;

public interface TaskIterator {
    boolean hasNext();
    Task getCurrent();
    void reset();
}
