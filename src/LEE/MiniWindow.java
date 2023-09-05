package LEE;

import java.util.Arrays;

public class MiniWindow {
    public static String minWindow(String s, String t) {
        int l=0;
        int r=0;
        int size=Integer.MAX_VALUE;
        int needCount=t.length();
        int start=0;
        int[] need=new int[128];
        for(int i=0;i<t.length();i++){
            need[t.charAt(i)]++;
        }

        while(r<s.length()){
            char c=s.charAt(r);
            if(need[c]>0) needCount--;
            need[c]--;
            if(needCount==0){
                while(l<r && need[s.charAt(l)]<0){
                    need[s.charAt(l)]++;
                    System.out.println(s.charAt(l));
                    l++;
                }
                if(r-l+1<size){
                    size=r-l+1;
                    start=l;
                }
                need[s.charAt(l)]++;
                l++;
                needCount++;
            }
            r++;
        }
        return size==Integer.MAX_VALUE?"":s.substring(start, start+size);
    }

    public static void main(String[] args) {
        String s ="ADOBECODEBANC";
        String t ="ABC";
        System.out.println(minWindow(s, t));
    }
}
