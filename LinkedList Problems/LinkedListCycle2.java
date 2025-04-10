import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(){}
    Node(int data){
        this.data = data;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
public class LinkedListCycle2 {
    public static Node createList(Node head, int val){
        Node newNode = new Node(val);
        if (head==null) {
            head = newNode;
            return head;
        }
        Node curr = head;
        while (curr.next!=null) {
            curr = curr.next;
        }
        curr.next = newNode;
        // newNode.next = head.next.next;

        return head;
    }

    public static Node listCycle2(Node head){
        Node slow = head;
        Node fast = head;
        if (head == null || head.next == null) {
            return null;
        }
        while(fast!=null || fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (fast!= slow) {
                    slow = slow.next;
                    fast = fast.next;    
                }
                return slow;
            }
        }
        return null;
    }

    public static int findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null ){
            System.out.println(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Node l1 = new Node();
        // for (int i = 0; i < 6; i++) {
        //     int val = sc.nextInt();
        //    l1 = createList(l1, val);
        // }
        Node l1 = new Node(10);
        l1.next = new Node(20);
        l1.next.next = new Node(30);
        l1.next.next.next = new Node(40);
        l1.next.next.next.next = new Node(50);

        // Node cur = l1.next;
        System.out.println("Middle Element : "+findMiddle(l1));
        // while (cur!= null) {
        //     System.out.println(cur.data);
        //     cur = cur.next;
        // }

        // Node curr = listCycle2(l1);

        // while (curr!= null) {
        //     System.out.println(curr.data);
        //     curr = curr.next;
        // }
    }
    
}
