// public class FirstLinkedList {
//     static class Node {
//         int data;
//         Node next;
//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static Node head;

//     // head node for initiation of nodes means first node which have no data and
//     // next part is null
    


//     //  create at 1st position in linkedlist 
//     // public static void createNode(Node head) {
        
//     //     if(head==null){

    
//     //     }

//     // }

//     public static void printList(Node head){
//         Node temp = head;
//         while(head!=null){
//             System.out.print(temp.data);
//             temp=temp.next;
//         }

//     }

//     public static void main(String args[]) {
//         Node one = new Node(10);
//         head = one;

//         one.next = new Node(20);

//         one.next.next = new Node(30);

//         one.next.next.next = new Node(40);

//         printList(head);
//     }

// }

import java.util.*;
class Node {
  int num;
  Node next;
  Node(int a) {
    num = a;
    next = null;
  }
}
class TUF {
  //utility function to insert node at the end of the list
  static Node insertNode(Node head, int val) {
    Node newNode = new Node(val);
    if (head == null) {
      head = newNode;
      return head;
    }
    Node temp = head;
    while (temp.next != null) temp = temp.next;

    temp.next = newNode;
    return head;
  }
  //utility function to rotate list by k times
  static Node rotateRight(Node head, int k) {
    if (head == null || head.next == null) return head;
    for (int i = 0; i < k; i++) {
      Node temp = head;
      while (temp.next.next != null) temp = temp.next;
      Node end = temp.next;
      temp.next = null;
      end.next = head;
      head = end;
    }
    return head;
  }
  //utility function to print list
  static void printList(Node head) {
    while (head.next != null) {
      System.out.print(head.num + "->");
      head = head.next;
    }
    System.out.println(head.num);

  }

  public static void main(String args[]) {
    Node head = null;
    //inserting Node
    head = insertNode(head, 1);
    head = insertNode(head, 2);
    head = insertNode(head, 3);
    head = insertNode(head, 4);
    head = insertNode(head, 5);

    System.out.println("Original list: ");
    printList(head);

    int k = 2;
    Node newHead = rotateRight(head, k); //calling function for rotating 
    // right of the nodes by k times

    System.out.println("After " + k + " iterations: ");
    printList(newHead); //list after rotating nodes

  }
}