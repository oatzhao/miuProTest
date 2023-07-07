package LEE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s){
        if (s == null) return 0;
        List<Character> list = new ArrayList<>();
        int temp = 0;
        for(int i=0;i<s.length();i++){
            if(list.contains(s.charAt(i))){
                list = list.subList(list.indexOf(s.charAt(i))+1, list.size());
            }
            list.add(s.charAt(i));
            temp = Math.max(temp, list.size());
        }

        return temp;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int len = lengthOfLongestSubstring(s);
        //System.out.println(len);

        Set<Character> set = new HashSet<>();
        System.out.println(set.add('a'));
        System.out.println(set.add('b'));
        System.out.println(set.add('a'));
    }
}
