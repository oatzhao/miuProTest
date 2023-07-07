package FPP.Lecture9;

import static java.lang.System.exit;

public class LinkedStack {
    class Node{
        int data;
        Node link;
    }
    Node top;

    LinkedStack(){this.top = null;}

    public void push(int x){
        Node temp = new Node();
        if(temp == null){
            System.out.println("Head Overflow");
            return;
        }

        temp.data = x;
        temp.link = top;
        top = temp;
    }

    public boolean isEmpty() {return top == null;}

    public int peek(){
        if(!isEmpty()){
            return top.data;
        }else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop(){
        if(top == null){
            System.out.println("Stack Underflow");
            return;
        }
        top = (top).link;
    }

    public void display(){
        if(top == null){
            System.out.println("Stack Underflow");
            exit(1);
        }else {
            Node temp = top;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.link;
                if(temp!=null){
                    System.out.println("->");
                }
            }
        }
    }

    public static void main(String[] args)
    {
        LinkedStack obj = new LinkedStack();
        // insert Stack value
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        // print Stack elements
        obj.display();

        // print Top element of Stack
        System.out.printf("\nTop element is %d\n",
                obj.peek());

        // Delete top element of Stack
        obj.pop();
        obj.pop();

        // print Stack elements
        obj.display();

        // print Top element of Stack
        System.out.printf("\nTop element is %d\n",
                obj.peek());
    }
}


