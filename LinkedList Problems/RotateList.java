public class RotateList {

    // public static Node rotateList(Node head, int n){
    //     Node prev=null, current = head;
    //     for(int i=0; i<n; i++){
    //     while (current.next!=null) {
    //         prev = current;
    //         current = current.next;
    //     }
    //     prev.next=null;
    //     current.next= head;
    // }
    //     return current;

    // }


    public static Node rotateList(Node head, int k){
        if (head == null || k==0) {
            return head;
        }
        Node current = head;
        int size =0;

        while(current.next != null){
            size++;
            current = current.next;
        }
        size++;
        current.next=head;

        int rotatepoint = size - k%size;
        current = head;
        for (int i = 1; i < rotatepoint; i++) {
            current = current.next;            
        }
        head = current.next;
        current.next = null;
        return head;
    }
    public static void main(String args[]){
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();
        
        node1.data = 10;
        node1.next = node2;
        node2.data = 20;
        node2.next = node3;
        node3.data = 30;
        node3.next = node4;
        node4.data = 40;
        node4.next = node5;
        node5.data = 50;
        node5.next = null;

        Node rotated = rotateList(node1, 6);

        Node current = rotated;
        while (current!=null) {
            System.out.print(current.data);
            current = current.next;
            System.out.print("->");
        }
        System.out.print("null");
    }
    
}
