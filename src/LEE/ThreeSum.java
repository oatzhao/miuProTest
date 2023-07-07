package LEE;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0 ;i<nums.length; i++){
            int k = nums.length-1;
            int j = i+1;
            while (j<k){
                int sum = nums[k]+nums[i]+nums[j];
                if(sum == 0){
                    s.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }else if(sum<0){
                    j++;
                }else {
                    k--;
                }

            }

        }
        ans.addAll(s);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
    }
}
