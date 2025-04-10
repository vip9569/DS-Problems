import java.util.*;

class Node{
    int data;
    Node next;
    Node prev;
    Node(){}
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class LinkedListExample{

    public static Node insertAtLast(Node head, int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return head;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;

        return head;
    }

    public static void deleteAtFirst(Node head){
        if (head == null) {
            return;
        }
        head = head.next;
        head.next.prev = null;
        
    }

    public static void deleteAtLast(Node head){
        if(head == null){
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.prev.next = null;
    }

    public static void deleteAtPosition(Node head, int pos){
        if (head == null) {
            return;
        }
        int count = 0;
        Node curr = head;
        while(curr.next != null){
            count++;
            curr = curr.next;
        }
        for(int i=0; i<pos-1; i++){
            curr = curr.prev;
        }
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;  
    }

    public static void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node head = new Node();
        // System.out.println("Enter Elements:");
        // for (int i = 0; i < 5; i++) {
        //     head.next = insertAtLast(head.next, sc.nextInt());
        // }
        // deleteAtFirst(head.next);
        // display(head.next);
        int choice;
        do{
            System.out.println("Enter any one choice please.....");
            System.out.println("Enter 1 for insert element At Last.");
            System.out.println("Enter 2 for delete from last.");
            System.out.println("Enter 3 for delete at first element.");
            System.out.println("Enter 4 for delete at position element.");
            System.out.println("Enter 5 for display the List.");
            System.out.println("Enter 6 for for Exit.");
    
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter element : ");
                    head.next = insertAtLast(head.next, sc.nextInt());
                    break;
                case 2:
                    // System.out.println("Enter element : ");
                    deleteAtLast(head.next);
                    break;
                case 3:
                    // System.out.println("Enter element : ");
                    deleteAtFirst(head.next);
                    break;
                case 4:
                    System.out.println("Enter Position : ");
                    deleteAtPosition(head.next, sc.nextInt());
                    break;
                case 5:
                    // System.out.println("Enter element : ");
                    display(head.next);
                    break;
                case 6:
                    break;
                default:
                    System.out.print("Invalid Input");
            }
        }while(choice!=6);
    }
}