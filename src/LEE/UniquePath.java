package LEE;

public class UniquePath {
    private final static int[][] DESTINATION=new int[][]{{1,0},{0,1}};
    static int count;
    static boolean[][] isVisited;
    static int endX;
    static int endY;
    public static int uniquePaths(int m, int n) {
        endX=m;
        endY=n;
        count=0;
        isVisited=new boolean[m][n];
        isVisited[0][0]=true;
        dfs(0,0);
        return count;
    }

    private static void dfs(int x, int y){
        if(x==endX-1 && y==endY-1){
            count+=1;
        }
        for(int[] destination:DESTINATION){
            int newX=x+destination[0];
            int newY=y+destination[1];
            if(newX>=0 && newX<endX && newY>=0 && newY<endY && !isVisited[newX][newY]){
                isVisited[newX][newY]=true;
                dfs(newX, newY);
                isVisited[newX][newY]=false;
            }
        }
    }


    public static int uniquePathsDp(int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=n;i++){
            dp[0][i]=1;
        }
        for(int j=0;j<=m;j++){
            dp[j][0]=0;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        int m=3, n=2;
        System.out.println(uniquePathsDp(m,n));
    }
}
