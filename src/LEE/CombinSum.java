package LEE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinSum {
    public static LinkedList<Integer> path=new LinkedList<>();
    public static List<List<Integer>> res=new ArrayList<>();
    public static int[] nums=new int[]{1, 2, 3, 4, 5 ,6 ,7, 8, 9};
    public static List<List<Integer>> combinationSum3(int k, int n) {
        dfs(k, n,0,0);
        return res;
    }

    public static void dfs(int k, int n, int index,int sum){
        if(path.size()==k&&sum==n){
            res.add(new ArrayList<>(path));
        }else if(path.size()==k&&sum!=n){
            return;
        }

        for(int i=index;i<nums.length;i++){
            if(nums[i]>n || sum>n)continue;
            path.add(nums[i]);
            sum+=nums[i];
            dfs(k, n, i+1, sum);
            sum-=nums[i];
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        int k=3, n=9;
        System.out.println(combinationSum3(k, n));
    }
}
