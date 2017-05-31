package structures;
import java.util.*;

public class SinglyLinkedList {

  public Node root;

  public void addToFront(int value) {
    if (this.root == null) {
      this.root = new Node(value);
      return;
    }
    Node n = new Node(value, root);
    this.root = n;
  }

  public void addToRear(int value) {

  }

  public void deleteFromFront() {

  }

  public void deleteFromRear() {

  }

  public void searchAndDelete(int value) {

  }

  public void searchAndAdd(int value) {

  }

  public void printList() {
    Node curr = this.root;
    do {
      System.out.print(curr);
      curr = curr.next;
    } while (curr != null);
    System.out.println();
  }
}
