package LEE;

import java.util.*;

public class isBracketValid {
    public boolean isValid(String s){
        if(s.length() <= 1) return false;
        Stack stack = new Stack();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }else {
                if(!map.get(stack.pop()).equals(s.charAt(i))) return false;
            }
        }
        if(stack.empty()) return true;
        return false;
    }
}
