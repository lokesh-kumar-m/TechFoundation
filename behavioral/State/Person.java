package behavioral.State;

public class Person {
    private String name;
    private String Id;
    private boolean isAuthenticated;

    public Person(String name,String Id){
        this.name=name;
        this.Id=Id;
    }
    public String getName(){
        return name; 
    }
    public String getId(){
        return Id;
    }
    public boolean getAuth(){
        return isAuthenticated;
    }
    public void setAuth(){
        this.isAuthenticated=!isAuthenticated;
    }
    public void setId(){
        this.Id=null;
    }
}
