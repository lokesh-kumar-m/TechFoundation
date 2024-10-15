package DSA.BSTs;

import DSA.BTrees.Node;

public class Features {
    public Node insert(int data, Node root){
        if(root==null){
            return new Node(data);
        }
        if(root.data<data){
            root.right=insert(data, root.right);
        }else if(root.data>data) {
            root.left=insert(data, root.left);
        }
        return root;
    }
    public void inorder(Node root){
        if(root==null)return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
}
