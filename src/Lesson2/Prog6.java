package Lesson2;

import java.util.Map;

public class Prog6 {
    static int min(int[] arrayOfInts){
        int minAns = Integer.MAX_VALUE;

        for(int i=0; i<arrayOfInts.length; i++){
            minAns = Math.min(arrayOfInts[i], minAns);
        }

        return minAns;
    }

    public static void main(String[] args){
        int[] a = new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        System.out.println(min(a));
    }
}
