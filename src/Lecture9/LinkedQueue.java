package Lecture9;

public class LinkedQueue {
    class Node{
        Object data;
        Node next;
        Node(Object item){data = item;}
    }
    Node front, rear;
    int count;
    public void enqueue(Object item){
        Node p  = new Node(item);
        if(front == null){
            front = rear = p;
            front.next = null;
        }

        if(front == rear){
            rear = p;
            front.next = rear;
            rear.next = null;
        }else {
            rear.next = p;
            rear =  p;
            rear.next = null;
        }
        count++;
    }

    public Object dequeue(){
        if(isEmpty()){
            System.out.println("Q is empty");
            return null;
        }
        Object item = front.data;
        front = front.next;
        count--;
        return item;
    }

    public void diplay(){
        Node p = front;
        System.out.println("Linked Q: ");
        if(p==null){
            System.out.println("empty");
        }
        while (p!=null){
            System.out.println(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    public boolean isEmpty(){return (front == null);}
    public Object peek(){return  front.data;}
    public int size(){return count;}

    public static class LinkedQueueDemo{
        public static void main(String [] args){
            LinkedQueue linkedQueue = new LinkedQueue();

        }
    }

}
