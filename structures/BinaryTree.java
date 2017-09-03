package structures;
import java.util.*;
import java.util.ArrayList;


public class BinaryTree {

    public TreeNode root;
    public int left;
    public int right;

    // public BinaryTree() {
    //     this.left = 0;
    //     this.right = 1;
    // }

    public void insert(int value) {
        if (this.root == null) {
            this.root = new TreeNode(value);
            return;
        }
        TreeNode curr = this.root;
        do {
            if (value == curr.value) {
                System.out.println("Value is a duplicate and already exists in the tree.");
                return;
            } else if (value < curr.value) {
                if (curr.left == null) {
                    curr.left = new TreeNode(value);
                    return;
                }
                curr = curr.left;
            } else if (value > curr.value) {
                if (curr.right == null) {
                    curr.right = new TreeNode(value);
                    return;
                }
                curr = curr.right;
            }
        } while (curr != null);
        System.out.println("Something went wrong here!");
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.value + ", ");
        inorder(root.right);
        return;
    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + ", ");
        preorder(root.left);
        preorder(root.right);
        return;
    }

    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + ", ");
        return;
    }

}
