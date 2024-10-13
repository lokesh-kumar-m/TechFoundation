package DSA.Queue;

public class Order {
    private String name;
    private boolean status;
    private int tableNumber;
    public Order(String name, int tableNumber) {
        this.name = name;
        this.status = false;
        this.tableNumber = tableNumber;
    }
    public void setStatus(){
        status=true;
    }
    public String getOrder(){
        return "Order: "+name+" for table "+tableNumber+" is ready";
    }
    public String getName(){
        return name;
    }
}
