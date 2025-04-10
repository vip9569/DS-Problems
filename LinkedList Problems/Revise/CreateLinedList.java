import java.util.Scanner;
class ListNode{
    int data;
    ListNode next;

    ListNode(){}

    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class CreateLinedList{

    public static Node createList(Node head, int val){
        Node newNode = new Node(val);
        if (head==null) {
            return newNode;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;

        return head;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node head = new Node();
        System.out.print("Enter the Number of Nodes : ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
           head = createList(head, sc.nextInt());
        }
        Node temp = head.next;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
        
    }
}