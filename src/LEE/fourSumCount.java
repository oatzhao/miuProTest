package LEE;

import java.util.LinkedList;

public class fourSumCount {
    static int total=0;
    static LinkedList<Integer> path=new LinkedList<>();
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int[][] nums={nums1, nums2, nums3, nums4};
        dfs(0, 0, nums);
        return total;
    }

    public static void dfs(int i, int sum, int[][] nums){
        if(path.size()==4){
            if(sum==0)total+=1;
            return;
        }
        for(int j=0;j<2;j++){
            sum+=nums[i][j];
            path.add(nums[i][j]);
            dfs(i+1, sum, nums);
            path.remove();
            sum-=nums[i][j];
        }
    }

    public static void main(String[] args){
        int[] nums1 ={1, 2};
        int[] nums2 ={-2, -1};
        int[] nums3 ={-1, 2};
        int[] nums4 ={0, 2};
        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
    }
}
