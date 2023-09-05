package LEE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s){
        StringBuilder subStr = new StringBuilder();
        int maxSize=0;
        String subString = "";
        for(int i=0;i<s.length();i++){
            if(subStr.indexOf(s.charAt(i)+"")>=0){
                subString = subStr.substring(subStr.indexOf(s.charAt(i)+"")+1);
                subStr = new StringBuilder(subString);
            }
            subStr.append(s.charAt(i));
            maxSize=Math.max(maxSize, subStr.length());
        }

        return maxSize;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int len = lengthOfLongestSubstring(s);
        System.out.println(len);

//        Set<Character> set = new HashSet<>();
//        System.out.println(set.add('a'));
//        System.out.println(set.add('b'));
//        System.out.println(set.add('a'));
    }
}
