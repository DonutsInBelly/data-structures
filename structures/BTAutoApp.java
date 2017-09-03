package structures;
import java.util.*;

public class BTAutoApp {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(25);
        bt.insert(12);
        bt.insert(6);
        bt.insert(18);
        bt.insert(37);
        bt.insert(43);
        bt.insert(31);

        bt.inorder(bt.root);
        System.out.println();
        bt.preorder(bt.root);
        System.out.println();
        bt.postorder(bt.root);
    }
}
