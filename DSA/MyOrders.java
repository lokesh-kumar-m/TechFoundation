package DSA;


public class MyOrders {
    private CustomLinkedList Queue;

    public MyOrders(CustomLinkedList queue){
        this.Queue=queue;
    }

    public void newOrder(Order order){
        Queue.add(order);
    }
    public String fetchOrder(){
        Node order=Queue.poll();
        order.data.setStatus();
        return order.data.getOrder();
    }
    public void getQueue(){
        Node n= Queue.peekFront();
        while(n!=null){
            System.out.println(n.data.getName());
            n=n.next;
        }
    }
}
