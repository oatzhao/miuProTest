package LEE;

public class Flowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] dp=new int[flowerbed.length+1];
        dp[0]=0;
        if(flowerbed[0]==1){
            dp[1]=0;
        }else{
            dp[1]=1;
        }
        for(int i=1;i<flowerbed.length;i++){
            if(flowerbed[i]==1||flowerbed[i-1]==1){
                dp[i]=dp[i-1];
            }else if(flowerbed[i]==0&&flowerbed[i-1]==0){
                dp[i]=dp[i-1]+1;
            }
        }
        return dp[flowerbed.length]>=n;
    }
    public static void main(String[] args){
        int[] flowerbed =new int[]{1,0,0,0,1};
        int n=1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
