package LEE;

import java.util.*;

public class findSubsequences {
    static LinkedList<Integer> path=new LinkedList<>();
    static List<List<Integer>> res=new ArrayList<>();
    static Set<List<Integer>> temp=new HashSet<>();
    public static List<List<Integer>> findSubsequences(int[] nums) {
        for(int i=0;i<nums.length;i++){
            path.add(nums[i]);
            dfs(nums[i], i+1, nums);
            path.removeLast();
        }
        for(List<Integer> array:temp) res.add(array);
        return res;
    }

    public static void dfs(int num, int index, int[] nums){
        if(path.size()>=2) temp.add(new ArrayList<>(path));
        for(int j=index;j<nums.length;j++){
            if(nums[j]>=num){
                path.add(nums[j]);
                dfs(nums[j], j+1, nums);
                path.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,6,7,7};
        //System.out.println(findSubsequences(nums));
        System.out.println(4%3);
    }
}
