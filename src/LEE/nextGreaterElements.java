package LEE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class nextGreaterElements {
    public static int nextGreaterElements(int n) {
        char[] chars=String.valueOf(n).toCharArray();
        int len=chars.length;

        for(int i=len-1;i>0;i--){
            if(chars[i-1]<chars[i]){
                Arrays.sort(chars, i, len);
                for(int j=i;j<len;j++){
                    if(chars[i-1]<chars[j]){
                        char temp=chars[i-1];
                        chars[i-1]=chars[j];
                        chars[j]=temp;
                        long ans=Long.parseLong(String.valueOf(chars));
                        if(ans>Integer.MAX_VALUE) return -1;
                        return (int)ans;
                    }
                }
            }
        }
        return -1;
    }

    public static boolean hasPairWithSum(int[] A, int[] B, int x) {
        HashMap<Integer, Integer> complementMap = new HashMap<>();
        for (int a : A) {
            int complement = x - a;
            complementMap.put(complement, a);
        }
        for (int b : B) {
            if (complementMap.containsKey(b)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums ={-1, 0};
        //System.out.println(Arrays.toString(nextGreaterElements(nums)));
        char[] chars={'3', '4', '2', '1'};
        Arrays.sort(chars);
        //System.out.println(nextGreaterElements(12));
        Hashtable<String, Integer> aa= new Hashtable<>();
        aa.put("aa", 1);
        System.out.println(aa.putIfAbsent("bb", 2));
        System.out.println(aa);
        System.out.println(aa.putIfAbsent("aa", 3));
        System.out.println(aa);

    }
}
