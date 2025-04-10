import java.util.*;
class Node{
    int data;
    Node next;
    Node(){ }
    Node(int data){
        this.data = data;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public void deleteGivenNode(Node deadNode){

        Node prev = deadNode;
        Node curr = deadNode.next;
        prev.data = curr.data;
        prev.next = curr.next;
        // return prev;
    }
}



public class DeleteGivenNode {
    public static void main(String args[]){

        Node obj = new Node();

        Node l1 = new Node(10);
        l1.next = new Node(20);
        l1.next.next = new Node(30);
        l1.next.next.next = new Node(40);
        l1.next.next.next.next = new Node(50);
        obj.deleteGivenNode(l1);
        Node curr = l1;
        while(curr!=null){
            System.out.print(curr.data);
            System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
    
}
