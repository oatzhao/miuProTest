package LEE;

import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int len = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1) ;
            }else {
                map.put(nums[i], 1);
            }
        }
        for(Integer num:map.keySet()){
            if(map.get(num)>len)
                return num;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
