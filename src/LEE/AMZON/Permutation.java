package LEE.AMZON;

import java.util.Arrays;

public class Permutation {
    public static boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){return false;}
        int[] count1 = new int[26];
        int[] count2 = new int[26];;

        int l=0;
        int r=l+s1.length()-1;

        for(int i=0;i<s1.length();i++){
            count1[s1.charAt(i)-'a']++;
        }

        for(int j=0;j<s1.length()-1;j++){
            count2[s2.charAt(j)-'a']++;
        }

        while(r<s2.length()){
            count2[s2.charAt(r)-'a']++;
            if(Arrays.equals(count1,count2))
                return true;
            else{
                count2[s2.charAt(l)-'a']--;
                if(count2[s2.charAt(l)-'a']<0) count2[s2.charAt(l)-'a']=0;
                l++;
                r++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidboaoo";
        System.out.println(checkInclusion(s1, s2));
    }
}
