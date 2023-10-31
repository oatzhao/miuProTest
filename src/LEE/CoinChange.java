package LEE;

public class CoinChange {
    public static int res=0;
    public static int count=0;
    public static int coinChange(int[] coins, int amount) {
        dfs(coins, 0, amount);
        return res;
    }

    public static void dfs(int[] coins, int sum, int amount){
        if(sum>amount)return;
        if(sum==amount){
            res=Math.max(res, count);
        }
        for(int i=0;i<coins.length;i++){
            count++;
            sum+=coins[i];
            dfs(coins, sum, amount);
            sum-=coins[i];
            count--;
        }
    }
    public static void main(String[] args) {
        int[] coins={1, 2, 5};
        int amount=11;
        //System.out.println(coinChange(coins, amount));
        int i=0/3;
        System.out.println(i);
    }
}
