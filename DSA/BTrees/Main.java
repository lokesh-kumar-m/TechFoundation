package DSA.BTrees;

public class Main {
    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
        Node root=dll.add(0);
        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.add(4);
        dll.add(5);
        dll.inorder(root);
    }
}
