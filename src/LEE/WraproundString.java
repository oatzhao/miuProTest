package LEE;

import java.util.HashMap;
import java.util.Map;

public class WraproundString {
    public static int findSubstringInWraproundString(String p) {
        int len = p.length();
        int l=0, r=0;
        int[] dp = new int[26];
        while(l<len) {
            while(r+1<len && (
                    p.charAt(r)+1 == p.charAt(r+1) ||
                            (p.charAt(r)=='z' && p.charAt(r+1)=='a') )) {
                r++;
            }
            while(l<=r) {
                char c = p.charAt(l);
                int offset = c-'a';
                dp[offset] = Math.max(dp[offset], r-l+1);
                l++;
            }
            r=l;
        }
        int res = 0;
        for(int i=0; i<26; i++) {
            res += dp[i];
        }
        return res;
    }
    public static void main(String[] args){
        String s="abc";
        //System.out.println(findSubstringInWraproundString(s));
        System.out.println(1110 | 0001);
        System.out.println(1110&0001);
    }
}
