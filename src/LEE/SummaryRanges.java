package LEE;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums){
        List<String> list = new ArrayList<>();
        if(nums.length==0)return list;
        int a = nums[0];
        for(int i=0;i<nums.length;i++){
            if(i == nums.length-1 ||nums[i]+1!=nums[i+1]){
                if(nums[i] != a)
                    list.add(a+"->"+nums[i]);
                else
                    list.add(a+"");
                if(i != nums.length-1){
                    a=nums[i+1];
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{8,9};
        List<String> ll =summaryRanges(nums);
        System.out.println(ll.toString());
    }

}
