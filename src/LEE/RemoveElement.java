package LEE;

public class RemoveElement {
    public int removeElement(int[] nums, int val){
        if(nums==null) return 0;

        int i=0;
        int j=nums.length-1;

        while(j>i){
            if(nums[i]!=val){
                i++;
            }else if(nums[i]==val && nums[j]==val){
                j--;
            }else {
                nums[i]=nums[j];
                i++;
                j--;
            }
        }
        return i+1;
    }

    public static int removeElement0(int[] nums, int val){
        int l=0, r=nums.length-1;
        while(l<r){
            if(nums[l]==val){
                while(nums[r]==val)r--;
                nums[l]=nums[r];
                r--;
            }
            l++;
        }
        return l+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement0(nums, val));
    }
}
