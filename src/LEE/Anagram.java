package LEE;

public class Anagram {
    public boolean isAnagram(String s, String t){
        if(s == null || t == null || s.length() != t.length()) return false;
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int j=0; j<freq.length; j++){
            if(freq[j] != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        //int a = Integer.M
        String s = "z";
        String t = "ccac";
        System.out.println("z"+1);
    }
}
