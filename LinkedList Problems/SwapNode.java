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

    // *****************Recursive Approach to swap pairs in linkedList**********************
    // public Node swapNode(Node head){
    //     if (head==null || head.next==null) {
    //         return head;
    //     }
    //     Node list = swapNode(head.next.next);
    //     head.next.next = head;
    //     Node newHead = head.next;
    //     head.next = list;
    //     return newHead;
         
    // }


    // *****************Iterative Approach to swap two pairs in LinkeList**************************
    public Node swapNode(Node head){
        if (head==null || head.next==null) {
            return head;
        }
        Node prev = head;
        Node curr = head.next;
        head = curr;
        while (curr != null) {
            prev.next = curr.next;
            curr.next = prev;
            curr = (prev.next!=null)?prev.next.next:null;
            Node temp = prev;
            prev=prev.next;
            if (curr!=null) {
                temp.next = curr;
            }
        }
        return head; 
    }
}

public class SwapNode {
    public static void main(String args[]){
    Node l1 = new Node(10);
    l1.next = new Node(30);
    l1.next.next = new Node(40);
    System.out.print("List Before Swap operation : ");
    Node curr1 = l1;
    while(curr1!=null){
        System.out.print(curr1.data);
        System.out.print(" -> ");
        curr1=curr1.next;
    }
    System.out.print("null");
    System.out.println("");

// swap code
    // Node temp = l1.next.next;
    // l1.next.next = l1.next.next;
    // l1.next = temp;
Node obj = new Node();

    System.out.print("list After Swap operation : ");
    Node curr = obj.swapNode(l1);
    while(curr!=null){
        System.out.print(curr.data);
        System.out.print(" -> ");
        curr=curr.next;
    }
    System.out.print("null");


    }
    
}
