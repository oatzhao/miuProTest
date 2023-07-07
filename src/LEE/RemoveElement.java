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
}
