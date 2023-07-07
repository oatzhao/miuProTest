package LEE;

import java.util.Arrays;

public class CommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        String prefix="";
        int len = Math.min(strs[0].length(), strs[strs.length-1].length());
        for(int i=0;i<len;i++){
            if(strs[0].charAt(i) != strs[strs.length-1].charAt(i)){
                return prefix;
            }

            prefix+=strs[0].charAt(i);
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        String aa = longestCommonPrefix(strs);

    }
}
