package LEE;

public class RepeatingCharacter {
    public static int characterReplacement(String s, int k){
        int maxCount = 0;
        int start=0;
        int[] countWin = new int[26];
        int res=0;

        for(int end=start;end<s.length();end++){
            countWin[s.charAt(end)-'A']++;
            maxCount = Math.max(maxCount, countWin[s.charAt(end)-'A']);

            if(end-start+1-maxCount>k){
                countWin[s.charAt(start)-'A']--;
                start++;
            }
            res=Math.max(res, end-start+1);
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println(characterReplacement(s, 1));
    }

}
