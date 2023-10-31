import java.util.Arrays;

public class findMinArrowShots {
    public static int findMinArrowShots(int[][] points) {
        int len=points.length;
        Arrays.sort(points, (a, b)->{
            if(a[0]==b[0])return b[1]-a[1];
            return a[0]-b[0];
        });

        int[] dp=new int[len];
        dp[0]=1;
        for(int i=1;i<points.length;i++){
            if(points[i-1][1]>=points[i][0]){
                dp[i]=dp[i-1];
                points[i][1]=Math.min(points[i-1][1], points[i][1]);
            }else{
                dp[i]=dp[i-1]+1;
            }
        }
        return dp[len-1];
    }
    public static void main(String[] args) {
        int[][] points={{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));
    }
}
