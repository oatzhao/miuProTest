package LEE;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals, int[] newInterval) {
        LinkedList<int[]> res=new LinkedList<>();
        res.add(intervals[0]);
        boolean insert=false;
        for(int i=0;i<intervals.length;i++){
            if(newInterval[0]<=res.getLast()[1] && !insert){
                int start=res.getLast()[0];
                int end=Math.max(res.getLast()[1], newInterval[1]);
                res.removeLast();
                res.add(new int[]{start, end});
                insert=true;
            }else{
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval={2,5};
        System.out.println(merge(intervals, newInterval));
    }
}
