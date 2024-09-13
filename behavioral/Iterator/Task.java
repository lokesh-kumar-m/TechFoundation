package behavioral.Iterator;

public class Task {
    private String data;
    private int importance;
    public Task(String data, int importance) {
        this.data = data;
        this.importance = importance;
    }
    public String getData() {
        return data;
    }
    public int getImportance() {
        return importance;
    }
}
