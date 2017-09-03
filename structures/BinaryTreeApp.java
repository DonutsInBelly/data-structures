package structures;
import java.util.*;

public class BinaryTreeApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        BinaryTree bst = new BinaryTree();
        char choice1;
        int input1;
        do {
            System.out.println("Binary Tree Options:");
            System.out.println("q: insert\nw: delete\ne: search\nr: preorder traversal\nt: inorder traversal\ny: postorder traversal\nz: exit");
            choice1 = scan.next().trim().charAt(0);
            switch (choice1) {
                case 'q':
                    System.out.println("Enter a number to Insert in the tree: ");
                    input1 = input.nextInt();
                    bst.insert(input1);
                    break;
                case 'w':
                    break;
                case 'e':
                    break;
                case 'r':
                    break;
                case 't':
                    bst.inorder();
                    break;
                case 'y':
                    break;
            }
        } while (choice1 != 'z');
    }
}
