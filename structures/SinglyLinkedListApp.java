package structures;

import java.util.*;

public class SinglyLinkedListApp {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    SinglyLinkedList sll = new SinglyLinkedList();
    char choice1;
    int input1;
    do {
      System.out.println("Singly Linked List Options: ");
      System.out.println("q: Add to front\nw: Add to rear\ne: delete from front\nr: delete from rear\nt: search and delete\ny: search and add\np: print entire list\nz: exit");
      choice1 = scan.next().trim().charAt(0);
      switch (choice1) {
        case 'q':
          System.out.println("Enter a number to Add to Front: ");
          input1 = input.nextInt();
          sll.addToFront(input1);
          break;
        case 'w':
          System.out.println("Enter a number to Add to Rear: ");
          input1 = input.nextInt();
          sll.addToRear(input1);
          break;
        case 'e':
          System.out.println("Deleting from Front.");
          sll.deleteFromFront();
          break;
        case 'r':
          System.out.println("Deleting from Rear.");
          sll.deleteFromRear();
          break;
        case 't':
        case 'y':
        case 'p':
          sll.printList();
          break;
      }
    } while (choice1 != 'z');
  }
}
