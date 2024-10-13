package DSA.Queue;

import DSA.LinkedList.CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList lst=new CustomLinkedList(new Order("pasta", 1));
        QueueImpl orders=new QueueImpl(lst);
        orders.newOrder(new Order("first", 3));
        orders.newOrder(new Order("second", 4));
        orders.newOrder(new Order("third", 3));
        orders.getQueue();
        orders.fetchOrder();
        orders.getQueue();
    }
}
