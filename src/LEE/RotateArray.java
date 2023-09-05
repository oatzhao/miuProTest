package LEE;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k=len%k;
        reverse(nums, 0, len-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, len-1);
    }

    public void reverse(int[] nums, int l, int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {

    }
}
