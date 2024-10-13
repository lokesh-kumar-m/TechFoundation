package DSA.LinkedList;

import DSA.Queue.Order;

public class CustomLinkedList {
    Node head;
    Node tempHead;
    Node current;

    public CustomLinkedList(Order order){
        head=new Node(order);
        tempHead=head;
        current=head;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data.getName()+"-->");
            temp=temp.next;
        }
    }
    
    public void add(Order order){
        Node temp=new Node(order);
        current.next=temp;
        current=current.next;
    }
    public Node queuepoll(){
        head=head.next;
        tempHead.next=null;
        Node temp=tempHead;
        tempHead=head;
        return temp;
    }
    public Node peekFront(){
        return head;
    }
    public Node peekLast(){
        return current;
    }
    public int size(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void insertAtIdx(int idx, Node newNode){
        if(size()>idx){
            Node temp=head;
            if(idx==0){
                newNode.next=head;
                head=newNode;
            }else{
                while(idx-->1){
                    System.out.println(temp.data.getName());
                    temp=temp.next;
                }
                Node dummy=temp.next;
                temp.next=newNode;
                temp=temp.next;
                temp.next=dummy;
            }
        }
        print();
    }

    public void deleteAtIdx(int idx){
        Node temp=head;
        if(idx==0){
            Node curr=head.next;
            head=curr;
        }else{
            while(idx-->1){
                temp=temp.next;
                System.out.println(temp.data.getName());
            }
            temp.next=temp.next.next;
        }
        print();
    }
    public void stackPop(){
        Node temp=head;
        while(temp.next!=current){
            temp=temp.next;
        }
        temp.next=null;
    }
}
