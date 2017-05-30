package structures;

public class Node {
  public int value;
  public Node next;
  public Node prev;

  public Node (int value) {
    this.value = value;
  }

  public Node (int value, Node next) {
    this.value = value;
    this.next = next;
  }

  public Node (int value, Node next, Node prev) {
    this.value = value;
    this.next = next;
    this.prev = prev;
  }

  public String toString() {
    return "[ " + value + " ]-->";
  }
}
