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
    if (this.root == null) {
      this.root = new Node(value);
      return;
    }
    Node curr = this.root;
    while (curr != null) {
      if (curr.next == null) {
        Node n = new Node(value);
        curr.next = n;
        return;
      }
      curr = curr.next;
    }
  }

  public void deleteFromFront() {
    if (this.root == null) {
      System.out.println("Unable to delete: Empty List.");
      return;
    }
    if (this.root.next == null) {
      this.root = null;
      return;
    }
    this.root = this.root.next;
    return;
  }

  public void deleteFromRear() {
    if (this.root == null) {
      System.out.println("Unable to delete: Empty List.");
      return;
    }
    Node curr = this.root;
    Node prev = null;
    do {
      if (curr.next == null && prev == null) {
        this.root = null;
        return;
      }
      if (curr.next == null) {
        prev.next = null;
        return;
      }
      prev = curr;
      curr = curr.next;
    } while (curr != null);
  }

  public void searchAndDelete(int value) {

  }

  public void searchAndAdd(int value) {

  }

  public void printList() {
    if (this.root == null) {
      System.out.println("Unable to print: Empty List.");
      return;
    }
    Node curr = this.root;
    do {
      System.out.print(curr);
      curr = curr.next;
    } while (curr != null);
    System.out.println();
  }
}
