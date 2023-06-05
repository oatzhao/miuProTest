package Lecture2;

import java.util.ArrayList;
import java.util.List;

public class Prog3 {
    public static void main(String[] args){
        String[] str = new String[]{"horse", "dog", "cat", "horse", "dog"};
        List<String> list = new ArrayList<String>();

        for(int i=0; i<str.length; i++){
            if(!list.contains(str[i])){
                list.add(str[i]);
            }
        }

        System.out.println(list);
    }
}
