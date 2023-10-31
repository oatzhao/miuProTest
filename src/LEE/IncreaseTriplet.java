package LEE;

public class IncreaseTriplet {
    public static boolean increasingTriplet(int[] nums) {
        int i=0, j=0;
        while(j<nums.length-1){
            j++;
            if(nums[j]>nums[i]){
                if(j-i+1==3)return true;
            }else{
                i=j;
                j++;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums ={2,4,-2,-3};
        System.out.println(increasingTriplet(nums));
    }
}
