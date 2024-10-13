package DSA.Stack;

public class Main {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.push("first");
        ll.push("second");
        ll.push("third");
        System.out.println(ll.peek().data);
        ll.pop();
        ll.print();
        System.out.println(ll.isEmpty());
        ll.pop();
        ll.pop();
        System.out.println(ll.isEmpty());
    }
}
