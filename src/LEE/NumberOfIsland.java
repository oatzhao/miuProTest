package LEE;

import java.util.List;

public class NumberOfIsland {
    private static final int[][] DESTINATION={{1,0},{0,-1},{-1,0},{0,1}};
    private static boolean[][] visited;
    private static int rows;
    private static int cols;

    public static int numIslands(char[][] grid) {
        rows=grid.length;
        if(rows==0)return 0;
        cols=grid[0].length;
        visited=new boolean[rows][cols];
        int count=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(grid, i ,j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfs(char[][] grid, int x, int y){
        visited[x][y]=true;
        for(int[] destination:DESTINATION){
            int newX=x+destination[0];
            int newY=y+destination[1];
            if(inArea(newX, newY) && grid[newX][newY]=='1'&&!visited[newX][newY]){
                dfs(grid, newX, newY);
            }
        }

    }

    public static boolean inArea(int x, int y){
        System.out.println(rows);
        return x>=0 && x<rows && y>=0 && y<cols;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
             };
        System.out.println(numIslands(grid));
    }
}
