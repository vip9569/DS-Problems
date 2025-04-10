class Node {
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



public class MergeTwoSortedLinkedList {


   public static Node sortedList(Node list1, Node list2){
        Node temp = new Node(0);
        Node returnedNode = temp;

        while(list1 != null && list2!=null){
            if (list1.data<list2.data) {
                temp.next = list1;
                list1= list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 != null){temp.next=list1;}
        if(list2 != null){temp.next=list2;}

        return returnedNode.next;
   }
    public static void main(String args[]){
        Node list1 = new Node(10);
        list1.next = new Node(20);
        list1.next.next = new Node(30);

        Node list2 = new Node(10);
        list2.next = new Node(30);
        list2.next.next = new Node(40);
        list2.next.next.next = new Node(50);

        Node result = sortedList(list1, list2);
        Node temp = result;
        while(temp!=null){
            System.out.print(temp.data);
            System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
    
}
