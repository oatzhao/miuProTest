package LEE;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int j=0;j<t.length();j++){
            count[t.charAt(j)-'a']--;
        }
        for(int num:count){
            if(num>0)return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isSubsequence("acb", "ahbgdc"));
    }
}
