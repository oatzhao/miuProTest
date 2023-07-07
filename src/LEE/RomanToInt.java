package LEE;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static int romanToInt(String s){
        if(s==null ) return 0;
        HashMap<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        if(s.length()==1) return map.get(s.charAt(0));
        int ans = 0;
        int i = s.length()-1;

        while (i>=1){
            if(map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
                ans=ans+map.get(s.charAt(i))-map.get(s.charAt(i-1));
                i--;
            }else {
                ans+=map.get(s.charAt(i));
            }
            i--;
        }
        if(map.get(s.charAt(1)) <= map.get(s.charAt(0))){
            ans+=map.get(s.charAt(0));
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "III";
        int ans = romanToInt(s);
        System.out.println(ans);
    }
}
