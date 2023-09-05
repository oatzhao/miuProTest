package LEE;

public class MaximalSquare {
    public static int maximalSquare(char[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][] dp=new int[rows+1][cols+1];

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(matrix[i-1][j-1]=='1'){
                    dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]))+1;
                }
            }
        }

        return dp[rows][cols];
    }
    public static void main(String[] args) {
        char[][] matrix ={{'0','1'}, {'1','0'}};
        System.out.println(maximalSquare(matrix));
    }
}
