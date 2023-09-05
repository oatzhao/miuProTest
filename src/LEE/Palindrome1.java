package LEE;

import java.util.LinkedList;

public class Palindrome1 {
    public static LinkedList<String> path=new LinkedList<>();
    public static int min=Integer.MAX_VALUE;
    public static int minCut(String s) {
        dfs(s, 0);
        return min;
    }
    public static void dfs(String s, int sIndex){
        if(sIndex==s.length()){
            for (String value : path) {
                System.out.println("**************");
                System.out.println(value);
            }
            min=Math.min(min, path.size());
            System.out.println(path.size());
        }
        for(int i=sIndex;i<s.length();i++){
            String str=s.substring(sIndex, i+1);
            if(isPalindrome(str)){
                path.add(str);
                dfs(s, i+1);
                path.removeLast();
            }
        }

    }
    public static boolean isPalindrome(String str){
        int l=0, r=str.length()-1;
        while(l<=r){
            if(str.charAt(l)!=str.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s ="aab";
        System.out.println(minCut(s));
    }
}
