import java.util.ArrayList;
import java.util.List;

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
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int data){
        this.data = data;
    }
    TreeNode(int data, TreeNode left, TreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}


public class ConvertListToBST109 {

    public static TreeNode createBST(List<Integer> arr, int start, int end){
        if (start>end) {
            return null;
        }
        // find mid of the array to make it root for height balance 
        int mid = start + (end-start)/2;

        TreeNode root = new TreeNode(arr.get(mid));

        root.left = createBST(arr, start, mid-1);

        root.right = createBST(arr, mid+1, end);

        return root;
    }

    public static TreeNode listToBST(Node head){
        List<Integer> arr = new ArrayList<>();
        while (head!=null){
            arr.add(head.data);
            head = head.next;

        }
        // System.out.println(arr);
        return createBST(arr, 0, arr.size()-1);
    }

        public static void preOrder(TreeNode root){
            if (root==null) {
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    public static void main(String args[]){
        Node head = new Node(-10);
        head.next = new Node(-3);
        head.next.next = new Node(0);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(9);

        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data);
            System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.print("null");


        TreeNode temp = listToBST(head);
        System.out.println();

        preOrder(temp);
    }
    
}
