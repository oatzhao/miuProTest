package LEE;

public class LongestPalindrome {
    public static int expend(String s, int i, int j){
        int L=i, R=j;
        while (L>=0 && R<s.length() && s.charAt(L)==s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }

    public static String longestPalindrome(String s){
        if(s.length() < 1) return "";

        int startIndex = 0;
        int endIndex = 0;

        for(int i=0;i<s.length();i++){
            int len1 = expend(s, i, i);
            int len2 = expend(s, i, i+1);
            int len = Math.max(len1, len2);
            if(len>endIndex-startIndex){
                startIndex = i-(len-1)/2;
                endIndex = i+len/2;
            }
        }
        return s.substring(startIndex, endIndex+1);
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
        String s1="hello";
        System.out.println(s1.substring(1,3));
    }
}
