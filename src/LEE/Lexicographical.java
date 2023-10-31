package LEE;

import java.util.ArrayList;
import java.util.List;

class Lexicographical {
    static List<Integer> res=new ArrayList<>();
    static String[] nums=new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    public static List<Integer> lexicalOrder(int n) {
        dfs(n, "");
        return res;
    }
    public static void dfs(int n, String num){
        if(num!="" && (num.charAt(0)=='0' || Integer.valueOf(num)>n))return;
        if(num!="")res.add(Integer.valueOf(num));
        for(int i=0;i<=9;i++){
            System.out.println(num+nums[i]);
            dfs(n, num+nums[i]);
        }
    }

    public static void main(String[] args) {
        //System.out.println(lexicalOrder(5));
        String test="ababcbcqdee";
        for(String t:test.split(String.valueOf('c'))){
            System.out.println("t:"+t);
            for(String f:t.split(String.valueOf('a'))){
                System.out.println("f:"+f);
            }
        }

    }
}
