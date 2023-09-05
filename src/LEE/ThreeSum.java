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

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int l=j+1, r=nums.length-1;
                while(l<r){
                    int sum=nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum==target){
                        set.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                    }else if(sum<target){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }
        res.addAll(set);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        //List<List<Integer>> ans = threeSum(nums);
        //System.out.println(ans);

        int[] nums4= new int[]{1,0,-1,0,-2,2};
        List<List<Integer>> ans4=fourSum(nums4, 0);
        System.out.println(ans4);
    }
}
