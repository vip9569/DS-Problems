import java.util.Scanner;

public class LinkedListCycle141 {

    public static Node createList(Node head, int val){
        Node newNode = new Node(val);
        if (head==null || head.next!=null) {
            head = newNode;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head.next;

        return head;
    }

    public static boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node l1 = new Node();
        int val =0;
        for (int i = 0; i < 5; i++) {
            val = sc.nextInt();
            createList(l1, val);
        }
        
        System.out.println(hasCycle(l1));
  }
    
}
