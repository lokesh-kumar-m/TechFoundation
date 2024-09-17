package behavioral.Memento.Memento;

public class SnapShot {
    private String type;
    private int x;
    private int y;
    private String action;

    public SnapShot(String type, int x,int y, String action) {
        this.type=type;
        this.x=x;
        this.y=y;
        this.action=action;
    }

    public String getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getAction() {
        return action;
    }

}
