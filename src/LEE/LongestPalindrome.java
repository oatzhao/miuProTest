package LEE;

public class LongestPalindrome {
    public static String expend(String s, int i, int j){
        String subStr="";
        int l=i, r=j;
        while(l>0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            subStr=s.substring(l, r+1);
            l--;
            r++;
        }
        return subStr;
    }

    public static String longestPalindrome(String s){
        String maxStr="";
        for(int i=0;i<s.length();i++){
            String oddStr=expend(s, i, i);
            String evenStr=expend(s, i, i+1);
            String tempStr=oddStr.length()>evenStr.length()?oddStr:evenStr;
            if(tempStr.length()>maxStr.length()) maxStr=tempStr;
        }
        return maxStr;
    }

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
//        String s1="hello";
//        System.out.println(s1.substring(1,3));
    }
}
