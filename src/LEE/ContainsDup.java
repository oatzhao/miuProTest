package LEE;

public class ContainsDup {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]&&Math.abs(j-i)<=k){
                    System.out.println(Math.abs(j-i));
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1, 2, 3, 1, 2, 3};
        int k=2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
