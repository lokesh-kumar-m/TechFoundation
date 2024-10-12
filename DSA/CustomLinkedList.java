package DSA;

public class CustomLinkedList {
    Node head;
    Node tempHead;
    Node current;

    public CustomLinkedList(Order order){
        head=new Node(order);
        tempHead=head;
        current=head;
    }
    
    public void add(Order order){
        Node temp=new Node(order);
        current.next=temp;
        current=current.next;
    }
    public Node poll(){
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
    public void insertAtIdx(){
        
    }
}
