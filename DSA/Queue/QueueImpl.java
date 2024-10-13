package DSA.Queue;

import DSA.LinkedList.CustomLinkedList;
import DSA.LinkedList.Node;

public class QueueImpl {
    private CustomLinkedList Queue;

    public QueueImpl(CustomLinkedList queue){
        this.Queue=queue;
    }

    public void newOrder(Order order){
        Queue.add(order);
    }
    public String fetchOrder(){
        Node order=Queue.queuepoll();
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
