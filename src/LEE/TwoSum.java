package LEE;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
//    public static int[] twoSum(int[] nums, int target){
//        if(nums == null) return new int[]{};
//
//        HashMap<Integer, Integer> map = new HashMap();
//        for(int i=0; i<nums.length; i++){
//            if(map.containsKey(target - nums[i])){
//                return new int[]{i, map.get(target - nums[i])};
//            }
//
//            map.put(nums[i], i);
//        }
//        return new int[]{};
//    }

    static int[] twoNum(int[] nums, int target){
        HashMap<Integer, Integer> map=new HashMap<>();
        int[] ans=new int[2];

        for(int i=0;i<nums.length;i++){
            int num=target-nums[i];
            if(map.containsKey(num)){
                ans[1]= map.get(num);
                ans[0]=i;
            }else{
                map.put(nums[i], i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int[] ans = twoNum(nums, 9);
        System.out.println(Arrays.toString(ans));
    }
}
