package LEE;

import java.util.*;

public class Course {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res=new int[numCourses];
        Queue<Integer> q=new LinkedList<>();
        int[] indegrees=new int[numCourses];
        HashMap<Integer, List<Integer>> adjacency=new HashMap<>();

        for(int i=0;i<numCourses;i++){
            adjacency.put(i, new ArrayList<>());
        }
        for(int [] cp:prerequisites){
            indegrees[cp[0]]++;
            adjacency.get(cp[1]).add(cp[0]);
        }

        for(int i=0;i<numCourses;i++){
            if(indegrees[i]==0)q.add(i);
        }

        int count=0;
        while(!q.isEmpty()){
            int course=q.poll();
            res[count++]=course;
            for(int cur:adjacency.get(course)){
                if(--indegrees[cur]==0) q.add(cur);
            }
        }
        if (count == numCourses) return res;
        return new int[0];
    }
    public static void main(String[] args) {
        int numCourses =4;
        int[][] prerequisites ={{1,0},{2,0},{3,1},{3,2}};
        System.out.println(findOrder(numCourses, prerequisites));
    }
}
