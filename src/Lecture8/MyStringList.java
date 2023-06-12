package Lecture8;

import java.util.Arrays;

public class MyStringList {
    private final int INITIAL_LENGTH = 4;
    private String[] currentArray;
    private int size;
    public MyStringList(){
        currentArray = new String[INITIAL_LENGTH ];
        size = 0;
    }

    public void add(String s){
        if(s == null) return;
        if(size == currentArray.length) resize();
        currentArray[size++] = s;
    }

    public String get(int i){
        if(i < 0 || i >= size){
            return null;
        }
        return currentArray[i];
    }

    private void resize(){
        System.out.println("resizing");
        int len = currentArray.length;
        int newlen = 2*len;
        String[] newArray = new String[newlen];
        System.arraycopy(currentArray, 0,  newArray, 0, len);
        currentArray = newArray;
    }

    public boolean find(String s){
        if(s == null) return false;
        for(String test: currentArray){
            if(test.equals(s)) return true;
        }

        return false;
    }

    public void insert(String s, int pos){
        if(pos > size || pos < 0) return;
        if(pos == currentArray.length || size + 1 > currentArray.length){
            resize() ;
        }
        String[] temp = new String[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos] = s;

        System.arraycopy(currentArray, pos, temp, pos+1, currentArray.length - pos);
        currentArray = temp;
        ++size;
    }
 public boolean remove(String  s){
        if(size == 0) return false;
        if(s == null) return false;
        int index = -1;
        for(int i = 0; i< size; i++){
            if(currentArray[i].equals(s)){
                index = i;
                break;
            }
        }
        if(index == -1) return false;
        String[] temp = new String[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index+1, temp, index, currentArray.length-(index+1));
        currentArray= temp;
        --size;
        return true;
 }

 public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0;i<size-1; ++i){
            sb.append(currentArray[i] + ", ");
        }
        sb.append(currentArray[size-1] + "]");
        return sb.toString();
 }

 public int size(){return size;}
 public boolean isEmpty(){return (size == 0);}
 public Object clone(){
        String[] temp = Arrays.copyOf(currentArray, size);
        return temp;
 }

    int[] arr;
    public void sort(int[] arr){
        if(arr == null) return;
        int len = arr.length;
        for(int i = 0;i< len;++i){
            int nextMinPos = minPos(i, len -1);
            swap(i, nextMinPos);
        }
    }
    void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int minPos(int i, int j){
        int pos = i;
        int min = arr[i];
        for(int k = i+1; k<=j; ++k){
            if(arr[k] < min){
                pos = k;
                min = arr[k];
            }
        }
        return pos;
    }


    public static void main(String[] args){
        MyStringList l = new MyStringList();
        l.add("Bob");
        l.add("Steve");
        l.add("Susan");
        l.add("Mark");
        l.add("Joe");
        System.out.println("Number of elements:" + l.size);
        System.out.println("Length of the current array:" + l.currentArray.length);

        l.insert("" ,2);
        l.insert("" ,5);
        l.insert("" ,7);

    }
}
