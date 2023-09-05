package LEE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class palindromePartition {
    static List<List<String>> res=new ArrayList<>();
    public static List<List<String>> partition(String s) {
        dfs(s);
        return res;
    }

    private static void dfs(String s){
        for(int len=1;len<s.length();len++){
            LinkedList<String> path=new LinkedList<>();
            for(int i=0;i<=s.length()-len;i++){
                String str=s.substring(i,i+len);
                System.out.println(str);
                System.out.println(isPalindrome(str));
                if(isPalindrome(str)) {
                    path.add(str);
                }
            }
            System.out.println(path);
            res.add(new ArrayList<>(path));
        }
    }

    private static boolean isPalindrome(String str){
        int l=0;
        int r=str.length()-1;
        while(l<=r){
            if(str.charAt(l)!=str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String myStr = "aab";
        System.out.println(partition(myStr));
    }
}
