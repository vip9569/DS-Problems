class Node{
    int data;
    Node next;
    Node(){};
    Node(int data){
        this.data = data;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class ReverseLinkedList {

public static Node reverseList(Node head){
    Node current = head;
    Node temp, prev = null;

    while (current!=null){
        temp = current.next;
        current.next = prev;
        prev = current;
        current = temp;
        }      
    return prev;
}

    public static void main(String args[]){
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        
        node1.data = 10;
        node1.next = node2;
        node2.data = 20;
        node2.next = node3;
        node3.data = 30;
        node3.next = node4;
        node4.data = 40;
        node4.next = null;

        Node reversedlist = reverseList(node1);
        Node current = reversedlist;

        while (current!=null) {
            System.out.print(current.data);
            current = current.next;
            System.out.print(" -> ");
        }
        System.out.print("null");

        // Node list1 = new Node();
        // Node list2 = new Node();
        // Node list3 = new Node();
        // Node list4 = new Node();
        
        // list1.data = 10;
        // list1.next = node2;
        // list2.data = 20;
        // list2.next = node3;
        // list3.data = 30;
        // list3.next = node4;
        // list4.data = 40;
        // list4.next = null;
    }
    
}
