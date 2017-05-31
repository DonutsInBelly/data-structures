package structures;

import java.util.*;

public class SinglyLinkedListApp {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    SinglyLinkedList sll = new SinglyLinkedList();
    char choice1;
    do {
      System.out.println("Singly Linked List Options: ");
      System.out.println("q: Add to front\nw: Add to rear\ne: delete from front\nr: delete from rear\nt: search and delete\ny: search and add\np: print entire list\nz: exit");
      choice1 = scan.next().trim().charAt(0);
      switch (choice1) {
        case 'q':
          System.out.println("Enter a number to Add to Front: ");
          int value = input.nextInt();
          sll.addToFront(value);
          break;
        case 'w':
        case 'e':
        case 'r':
        case 't':
        case 'y':
        case 'p':
          sll.printList();
          break;
      }
    } while (choice1 != 'z');
  }
}
