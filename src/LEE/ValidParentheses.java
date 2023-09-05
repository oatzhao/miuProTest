package LEE;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if(s.length() <= 1) return false;
        HashMap<Character, Character> map=new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> sk=new Stack<>();
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(!sk.empty() && c==sk.peek()){
                sk.pop();
            }else if(map.containsKey(c)){
                sk.push(map.get(c));
            }
        }
        return sk.empty();
    }

    public static void main(String[] args) {
        String s=")(){}";
        isValid(s);
    }
}
