class Node{
    int data;
    Node next;

    Node(){}
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Intersection {
 
    // ********************It is a brute force approach time = O(N*M)********************************
    public static Node intersect(Node l1, Node l2){
        Node temp = l2;
        while(temp!=null){
            Node temp2 = l1;
            while(temp2!=null){
                if(temp==temp2){
                    return temp;
                }
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        return null;
    }


    public static void main( String args[]){
        Node l1 = new Node(10);
        l1.next = new Node(20);
        l1.next.next = new Node(20);
        l1.next.next.next = new Node(20);
        l1.next.next.next.next = new Node(20);

        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = l1.next.next;
        // l2.next.next = new Node(20);
        // l2.next.next.next = new Node(20);
        // l2.next.next.next.next = new Node(20);


        Node ans = intersect(l1, l2);
        System.out.println(ans.data);
        
    }
    
}
