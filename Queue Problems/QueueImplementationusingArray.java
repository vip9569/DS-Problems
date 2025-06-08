// import java.util.*;

// CircularQueue
class Queue{
    private int size;
    private int rear;
    private int front;
    private int arr[];

    Queue(int size){
        this.size = size;
        arr = new int[size];
        front = rear = -1;
    }
    public boolean isEmpty(){
        return rear==-1 && front==-1;
    }
    public boolean isFull(){
        return (rear+1)%size==front;
    }
    // Enqueue
    public void add(int data){
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front==-1) {
            front = (front+1)%size;
        }
        rear = (rear+1)%size;
        arr[rear] = data;
    }

    public int remove(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int res = arr[front];

        // Single lement Condition when both rear and front are equals to 0.
        if(rear == front){
            rear=front=-1;
        }else{
            front = (front+1)%size;
        }
        return res;
    } 

    public int peek(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
    }

    public void display(){
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }

    public int size(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return rear-front+1;
    }
}

public class QueueImplementationusingArray{
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        // q.add(60);   // Queue is full

        // System.out.println("Removed "+q.remove());
        // System.out.println("Removed "+q.remove());
        // System.out.println("Removed "+q.remove());
        // System.out.println("Removed "+q.remove());
        // System.out.println("Removed "+q.remove());
        // System.out.println("Removed "+q.remove());
        // q.display();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        System.out.println(q.peek());
        System.out.println(q.size());

    }
}