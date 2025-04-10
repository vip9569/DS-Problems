
public class OddEvenList228 {
    // public static Node oddEvenList(Node head){
    //     if(head == null){
    //         return head;
    //     }
    //     Node oddhead = new Node();
    //     Node oddtail = oddhead;
    //     Node evenhead = new Node();
    //     Node eventail = evenhead;
    //     while(head!=null){
    //         if (head.data % 2 == 0){
    //             eventail.next = head;
    //             eventail = eventail.next;
    //         } else{
    //             oddtail.next = head;
    //             oddtail = oddtail.next;
    //         }
    //         head = head.next;
    //     }
    //     oddtail.next = evenhead.next;
    //     eventail.next = null;
    //     return oddhead.next;
    // }

    public static Node odd(Node head) {
        if(head == null || head.next == null) return head;
        Node odd = head, even = head.next, evenHead = even;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    

    }
    public static void main( String args[]){
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);

    Node result = odd(head);
    while (result!=null){
        System.out.print(result.data);
        System.out.print(" -> ");
        result = result.next;
    }       
    System.out.print("null");
    }
}