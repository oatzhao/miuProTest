package LEE;

public class MiniSizeSubarray {
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength=Integer.MAX_VALUE;
        int len=nums.length;
        for(int i=0;i<len;i++){
            int start=i;
            int j=start;
            int sum=0;
            while(j<len){
                if(sum<7){
                    sum+=nums[j];
                    j++;
                }else{
                    minLength=Math.min(minLength, j-start);
                    start=j;
                    sum=0;
                }
            }
        }
        return minLength;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7, nums));
    }
}
