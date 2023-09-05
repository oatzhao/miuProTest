package LEE;

public class LongestCommonSubsequece {
    public static int longestCommonSubsequence(String text1, String text2) {
        int j=0;
        int count=0;
        for(int i=0;i<text1.length();i++){
            while(j<text2.length()){
                if(text1.charAt(i)==text2.charAt(j)){
                    count++;
                    break;
                }
                j++;
            }
            System.out.println(j);
        }
        return count;
    }
    public static void main(String[] args) {
        String text1="abcde";
        String text2="ace";
        System.out.println(longestCommonSubsequence(text1, text2));
    }
}
