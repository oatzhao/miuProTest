package LEE;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        if(nums == null) return new int[]{};

        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int[] ans = twoSum(nums, 9);
    }
}
