package DSA.BTrees;

import java.util.LinkedList;
import java.util.Queue;

public class DoublyLL {
    private Node root;

    public DoublyLL() {
        root = null;
    }

    public Node add(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                Node current = q.poll();
                if (current.left == null) {
                    current.left = new Node(data);
                    break;
                } else {
                    q.add(current.left);
                }
                if (current.right == null) {
                    current.right = new Node(data);
                    break;
                } else {
                    q.add(current.right);
                }
            }
        }
        return root;
    }

    public void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public void preorder(Node root) {
        if (root == null)
            return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
}
