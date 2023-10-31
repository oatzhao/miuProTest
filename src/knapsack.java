import java.util.List;

public class knapsack {
    public static int knapsack(String[] objects, int[] benefit, int[] weight, int cap){
        int len=objects.length;
        int[][] dp=new int[len+1][cap+1];

        for(int i=1;i<=len;i++){
            for(int j=1; j<=cap; j++){
               dp[i][j]=dp[i-1][j];
               if(j>=weight[i-1]){
                   dp[i][j]=Math.max(dp[i][j], dp[i-1][j-weight[i-1]]+benefit[i-1]);
               }
            }
        }
        return dp[len][cap];
    }

    public static void main(String[] args) {
        String [] objects={"a", "b", "c", "d", "e", "f", "g"};
        int[] benefit={12, 10, 8, 11, 14, 7, 9};
        int[] weight={4, 6, 5, 7, 3, 1, 6};
        System.out.println(knapsack(objects, benefit, weight, 15));
    }
}
