package LEE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityEle {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        if (nums.length < 3) {
            for (int i=0;i<nums.length;i++) {
                if(i>=1&&nums[i]==nums[i-1])continue;
                ls.add(nums[i]);
            }
            return ls;
        }

        Arrays.sort(nums);
        int count=1, len=nums.length/3;
        int i=1;
        while(i<nums.length){
            while(i<nums.length&&nums[i]==nums[i-1]){
                count++;
                i++;
            }
            if(count>len){
                ls.add(nums[i-1]);
                count=1;
            }
            i++;
        }
        return ls;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{4,1,3,1,3,3,1,2,3,2,4,2,1,4,4,4,4,4};
        System.out.println(majorityElement(nums));
    }
}
