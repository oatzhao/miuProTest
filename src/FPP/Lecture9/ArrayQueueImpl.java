package FPP.Lecture9;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void enqueue(int obj){
        if(arr.length == size()){
            resize();
        }
        arr[rear] = obj;
        rear++;
    }

    public int dequeue() {
        int val;
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        } else {
            val = arr[0];
            for(int i = 0;i < rear -1; i++){
                arr[i] = arr[i + 1];
            }
            rear--;
        }
        return val;
    }


    public boolean isEmpty(){
        return front == -1;
    }

    public int size(){
        return rear;
    }

    private void resize(){
        System.out.println("resizing");
        int len = arr.length;
        int newlen = 2*len;
        int[] newarr = new int[newlen];
        System.arraycopy(arr, 0,  newarr, 0, len);
        arr = newarr;
    }

    public void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.printf("Queue is Empty");
            return;
        }

        // traverse front to rear and print elements
        for (i = 0 ; i < rear; i++) {
            System.out.printf(" %d <-- ", arr[i]);
        }
        return;
    }

    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.queueDisplay();
    }
}
