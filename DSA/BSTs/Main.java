package DSA.BSTs;

import DSA.BTrees.Node;

public class Main {
    public static void main(String[] args) {
        Features bsts=new Features();
        Node root=bsts.insert(10, null);
        bsts.insert(2, root);
        bsts.insert(4, root);
        bsts.insert(1, root);
        bsts.insert(6, root);
        bsts.insert(12, root);
        bsts.insert(11, root);
        bsts.insert(16, root);
        bsts.insert(20, root);
        bsts.inorder(root);
    }
}
