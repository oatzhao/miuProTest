package LEE;

public class SearchRotatedArray {
    public static int search(int[] nums, int target) {
        if(nums == null || nums.length==0) return -1;
        int left=0;
        int right=nums.length-1;

        while (left<right){
            int midpoint = left+(right-left)/2;
            if(nums[midpoint] > nums[right]){
                left=midpoint+1;
            }else {
                right=midpoint;
            }
        }

        int pivot = left;
        int l=0;
        int r=nums.length-1;
        if(target>=nums[pivot] && target<=nums[r]){
            l = pivot;
        }else {
            r = pivot;
        }

        while (l<=r){
            int index = l+(r-l)/2;
            if(nums[index] == target){
                return index;
            }else if(target<nums[index]){
                r = index-1;
            }else{
                l = index+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3};
        int a = search(nums, 3);
        System.out.println(a);
    }
}
