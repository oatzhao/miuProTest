package FPP.Lecture9;


public class ArrayStack {
    private Object a[];
    private int top;

    public ArrayStack(int n){
        a = new Object[n];
        top = -1;
    }

    public void push(Object item){
        if(top == a.length - 1){
            System.out.println("Stack is full");
            return;
        }
        top++;
        a[top] = item;
    }

    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        Object item = a[top];
        top--;
        return item;
    }

    public Object peek(){
        if(isEmpty())
            return null;
        return a[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public int size(){
        return top + 1;
    }

    public static class ArrayStackDemo{
        public static void main(String [] args){
            ArrayStack arrayStack = new ArrayStack(4);
            arrayStack.push('A');
            arrayStack.push('B');
            arrayStack.push('C');
            arrayStack.push('D');
        }
    }

}
