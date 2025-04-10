import java.util.*;

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

public class AddTwoNumber {

    public static Node createList(Node list, int data){
        Node newNode = new Node(data);

        if (list==null){
            list = newNode;
        }
        Node curr = list;
        while(curr.next!=null){
            curr = curr.next;    
        } 
        curr.next = newNode;

        return list;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node list = new Node();
        int n, p;
        System.out.print("Enter the list length: ");
        p = sc.nextInt();
        System.out.println("Enter values : ");
        for(int i=0; i<p; i++){
            n = sc.nextInt();
            list.next = createList(list, n);
        }
        Node curr = list;
        while (curr!=null) {
            System.out.print(curr.data);
            System.out.print("->");
            curr = curr.next;
        }
        System.out.print("null");
    }
    
}







