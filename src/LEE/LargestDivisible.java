package LEE;

import java.util.*;

public class LargestDivisible {
    static LinkedList<Integer> path=new LinkedList<>();
    static List<Integer> res=new ArrayList<>();;
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        dfs(nums, 0);
        return res;
    }

    public static void dfs(int[] nums, int index){
        if(path.size()>res.size()){
            res.clear();
            for(Integer p:path){
                res.add(p);
            }
        }
        for(int i=index;i<nums.length;i++){
            if(path.size()==0 || isLegal(nums[i])){
                path.add(nums[i]);
                dfs(nums, i+1);
                path.remove();
            }
        }
    }

    public static boolean isLegal(int n){
        for(Integer p:path){
            if(p%n!=0 && n%p!=0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums={1};
        //System.out.println(largestDivisibleSubset(nums));
        //Integer.valueOf("");
        System.out.println(Integer.valueOf("1"));
    }
}
