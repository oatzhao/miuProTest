package LEE;

import java.util.Arrays;
import java.util.HashMap;

public class TopK {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] count = new int[nums.length+1];

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.merge(nums[i], map.get(nums[i]), (a, b)->b+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        for(Integer num:map.keySet()){
            count[map.get(num)]=num;
        }
        int[] res=new int[k];
        for(int i=count.length-1, j=0;i>0 && j<k;i--){
            if(count[i]!=0){
                res[j]=count[i];
                j++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2};
        int[] res= topKFrequent(nums, 2);
        System.out.println(Arrays.toString(res));
    }
}
