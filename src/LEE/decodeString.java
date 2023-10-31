package LEE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class decodeString {
    public static String decodeString(String s) {
        Stack<String> stack=new Stack<>();
        List<String> nums= Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7","8", "9");
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==']'){
                String str="";
                String subStr="";
                while(!stack.isEmpty() && !stack.peek().equals("[")){
                    str=stack.pop()+str;
                }
                stack.pop();
                String num="";
                while(!stack.isEmpty() && nums.contains(stack.peek())){
                    num=stack.pop()+num;
                }
                for(int j=0;j<Integer.parseInt(num);j++){
                    subStr+=str;
                }
                stack.push(subStr);
            }else{
                stack.add(c+"");
            }
        }

        while(!stack.isEmpty()){
            res=stack.pop()+res;
        }
        return res;
    }
    public static void main(String[] args) {
        String s="100[leetcode]";
        System.out.println(decodeString(s));
    }
}
