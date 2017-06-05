package structures;
import java.util.*;

public class SinglyLinkedList {

  public Node root;

  // Adds a node to the Head of a Linked List
  public void addToFront(int value) {
    if (this.root == null) {
      this.root = new Node(value);
      return;
    }
    Node n = new Node(value, root);
    this.root = n;
  }

  // Adds a node to the Tail of a Linked List
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

  // Deletes a node at the Head of a Linked List
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

  // Deletes a node at the Tail of a Linked List
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

  // Starts from the Head of a Linked List and iterates until it finds the node to delete
  public void searchAndDelete(int value) {
    if (this.root == null) {
      System.out.println("Unable to delete: Empty List.");
      return;
    }
    Node curr = this.root;
    Node prev = null;
    do {
      if (curr.value == value && prev == null) {
        if (curr.next != null) {
          this.root = curr.next;
          curr = curr.next;
          continue;
        } else {
          this.root = null;
          return;
        }
      } else if (curr.value == value) {
        prev.next = curr.next;
        curr = curr.next;
        continue;
      }
      prev = curr;
      curr = curr.next;
    } while (curr != null);
  }

  // Starts from the Head of a Linked List and iterates until it finds the node and inserts a node before it
  public void searchAndAddBefore(int target, int value) {
    if (this.root == null) {
      this.root = new Node(value);
      return;
    }

    Node curr = this.root;
    Node prev = null;
    do {
      if (curr.value == target && prev == null) {
        Node n = new Node(value, this.root);
        this.root = n;
        return;
      } else if (curr.value == target) {
        prev.next = new Node(value, curr);
        return;
      }
      prev = curr;
      curr = curr.next;
    } while (curr != null);
  }

  // Starts fromt the Head of a Linked List and iterates until it finds the node and inserts a nade after it
  public void searchAndAddAfter(int target, int value) {
    if (this.root == null) {
      this.root = new Node(value);
      return;
    }

    Node curr = this.root;
    do {
      if (curr.value == target) {
        Node n = new Node(value, curr.next);
        curr.next = n;
      }
      curr = curr.next;
    } while (curr != null);
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
