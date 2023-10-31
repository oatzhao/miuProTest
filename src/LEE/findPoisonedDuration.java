package LEE;

public class findPoisonedDuration {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum=timeSeries.length * duration;
        for(int i=1;i<timeSeries.length;i++){
            sum-=duration-(timeSeries[i]-timeSeries[i-1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums={1, 4};
        System.out.println(findPoisonedDuration(nums, 2));
    }

}
