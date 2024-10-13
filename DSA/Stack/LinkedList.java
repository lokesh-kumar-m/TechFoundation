package DSA.Stack;

class Node{
    public String data;
    Node next;
    public Node(String data){
        this.data=data;
        next=null;
    }
}

public class LinkedList {
    private Node head;

    public LinkedList(){
        head=null;
    }

    public void push(String name){
        Node newNode=new Node(name);
        newNode.next=head;
        head=newNode;
    }
    public void pop(){
        Node temp=head.next;
        head=null;
        head=temp;
    }
    public boolean isEmpty(){
        if(head!=null)return false;
        return true;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public Node peek(){
        Node temp=head;
        if(temp!=null){
            return temp;
        }
        return null;
    }
}
