package DSA.Array;

public class User {
    private String name;
    private int id;
    
    public User(String name){
        this.name=name;
        this.id=(int)Math.random()*1000;
    }
    
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}