package Lecture8.prob3;


import Lecture6.NameComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarketArraylist implements List<T> {
    private Marketing[] currentArray;
    private int size;
    private final int INITIAL_LENGTH = 4;

    public MarketArraylist(){
        currentArray = new Marketing[INITIAL_LENGTH];
        size = 0;
    }

    public void add(Marketing s){
        if(s == null) return;
        if(size == currentArray.length) resize();
        currentArray[size++] = s;
    }

    private void resize(){
        System.out.println("resizing");
        int len = currentArray.length;
        int newlen = 2*len;
        Marketing[] newArray = new Marketing[newlen];
        System.arraycopy(currentArray, 0,  newArray, 0, len);
        currentArray = newArray;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0;i<size-1; ++i){
            sb.append(currentArray[i] + ", ");
        }
        sb.append(currentArray[size-1] + "]");
        return sb.toString();
    }

    public boolean remove(String s){
        if(size == 0) return false;
        if(s == null) return false;
        int index = -1;
        for(int i = 0; i< size; i++){
            if(currentArray[i].getEmployeename().equals(s)){
                index = i;
                break;
            }
        }
        if(index == -1) return false;
        Marketing[] temp = new Marketing[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index+1, temp, index, currentArray.length-(index+1));
        currentArray= temp;
        --size;
        return true;
    }

    public static void main(String[] args){
        MarketArraylist market = new MarketArraylist();
        market.add(new Marketing("Bob", "pen", 200));
        market.add(new Marketing("Susan", "pen", 300));
        market.add(new Marketing("Jack", "pen", 400));
        market.add(new Marketing("Tom", "pen", 500));
        Marketing newer0 = new Marketing("Tom", "pen" , 600);
        Marketing newer1 = new Marketing("Tom", "pen" , 600);
        System.out.println(newer0.equals(newer1));
        System.out.println("Number of elements:" + market.size);

        System.out.println(market.toString());

//        market.remove("Bob");
//        System.out.println(market.toString());
        Collections.sort(market, new MarketComparator());
    }



}
