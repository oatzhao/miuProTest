package LEE;

import java.util.HashSet;

class Solution {
    public static int maxProduct(int[] nums) {
        int ans = nums[0];
        int dpMin = nums[0];
        int dpMax = nums[0];

        for (int i = 1; i < nums.length; ++i) {
//            final int num = nums[i];
//            final int prevMin = dpMin;
//            final int prevMax = dpMax;
            if (nums[i] < 0) {
                dpMin = Math.min(dpMax * nums[i], nums[i]);
                dpMax = Math.max(dpMin * nums[i], nums[i]);
            } else {
                dpMin = Math.min(dpMin * nums[i], nums[i]);
                dpMax = Math.max(dpMax * nums[i], nums[i]);
            }
            ans = Math.max(ans, dpMax);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = new int[]{-2,3,-4};
        System.out.println(maxProduct(a));
    }
}



