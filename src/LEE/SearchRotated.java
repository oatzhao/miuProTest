package LEE;

public class SearchRotated {
    public static boolean search(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while (l < r && nums[0] == nums[r]) r--;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>nums[l]){
                l=mid+1;
            }else{
                r=mid;
            }
        }

        int privot=r;
        int ans=biSearch(nums, 0, privot-1, target);
        if(ans!=-1)return true;
        ans=biSearch(nums, privot, nums.length-1, target);

        return ans!=-1;
    }
    public static int biSearch(int[] nums, int left, int right, int target){
        int l=left, r=right;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums=new int[]{1,0,1,1,1};
        int target=0;
        System.out.println(search(nums, target));
    }
}
