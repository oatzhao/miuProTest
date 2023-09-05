package LEE;

import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates {
    private static final int[][] DESTINATION={{1,0}, {0, 1}, {-1,0}, {0,-1}};
    public void wallsAndGates(int[][] rooms) {
        int rows=rooms.length;
        int cols=rooms[0].length;

        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(rooms[i][j]==0)q.add(new int[]{i, j});
            }
        }

        while(!q.isEmpty()){
            int[] room=q.poll();
            int x=room[0];
            int y=room[1];

            for(int[] destination:DESTINATION){
                int newX=x+destination[0];
                int nexY=y+destination[1];
                if(newX>=0 && newX<rows && nexY>=0 && nexY<cols && rooms[newX][nexY]!=-1 && rooms[newX][nexY]==2147483647){
                    rooms[newX][nexY]=rooms[x][y]+1;
                    q.add(new int[]{newX, nexY});
                }
            }
         }
    }
}
