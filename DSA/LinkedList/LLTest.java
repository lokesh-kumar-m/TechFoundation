package DSA.LinkedList;

import DSA.Queue.Order;

public class LLTest {
    public static void main(String[] args) {
        CustomLinkedList cst= new CustomLinkedList(new Order("first order", 0));
        cst.add(new Order("second order", 0));
        cst.add(new Order("third order", 0));
        cst.add(new Order("fourth order", 0));
        cst.insertAtIdx(0,new Node(new Order("fifth", 0)));
        System.out.println();
        cst.deleteAtIdx(2);
    }    
}
