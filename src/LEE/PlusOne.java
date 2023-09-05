package LEE;

import java.util.LinkedList;
import java.util.Stack;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        Stack <Integer> p=new Stack<>();
        int flag=0;
        for(int i=digits.length-1;i>=0;i--){
            int temp;
            if(i==digits.length-1){
                temp=digits[i]+1+flag;
            }else{
                temp=digits[i]+flag;
            }
            p.add(temp%10);
            flag=temp/10;
        }
        if(flag!=0)p.add(flag);
        int s=p.size();
        int[] res=new int[s];
        for(int i=0;i<s;i++){
            res[i]=p.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] digits ={1,2,3};
        System.out.println(plusOne(digits));
    }
}
