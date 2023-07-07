package LEE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int temp = 1;
        int count = 0;
        if(nums.length <= 1)return nums.length;

        for(int i=1; i<nums.length; i++){
            if(nums[i-1]+1==nums[i]){
                temp++;
            }else if(nums[i-1] != nums[i]){
                temp=1;
            }
            count=Math.max(temp, count);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0};
        int aa = longestConsecutive(nums);
        System.out.println(aa);
    }
}


