package LEE;

import java.util.Arrays;

public class makesquare {
    static int[] array=new int[4];
    static int length;
    static int[] matchsticks;
    public static boolean makesquare(int[] _matchsticks) {
        matchsticks=_matchsticks;
        int total=0;
        for(int n:matchsticks){
            total+=n;
        }
        length=total/4;
        return dfs(0);
    }

    public static boolean dfs(int index){
        if(index==matchsticks.length) {
            return true;
        }

        for(int i=0;i<4;i++){
            int n=matchsticks[index];
            if(array[i]+n>length)continue;
            array[i]=array[i]+n;
            if(dfs(index+1))return true;
            array[i]=array[i]-n;
        }

        return false;
    }
    public static void main(String[] args) {
        int[] matchsticks = {2,1,2,1,2};
        System.out.println(makesquare(matchsticks));
    }
}
