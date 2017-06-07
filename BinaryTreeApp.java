package structures;
import java.util.*;

public class BinaryTreeApp {

  public enum {
    LEFT(0);
    RIGHT(1);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    BinaryTree bst = new BinaryTree();
    char choice1;
    int input1;
    do {
      System.out.println("Binary Tree Options:");
      System.out.println("q: insert\nw: delete\ne: search\nr: preorder traversal\nt: inorder traversal\ny: postorder traversal\z: exit");
      choice1 = scan.next().trim().charAt(0);
      switch (choice1) {
        case 'q':
          break;
        case 'w':
          break;
        case 'e':
          break;
        case 'r':
          break;
        case 't':
          break;
        case 'y':
          break;
      }
    } while (choice1 != 'z');
  }
}
