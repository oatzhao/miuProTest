public class Win {
    static boolean[] visited;
    static int[] nums;
    static int step;
    public static boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        visited=new boolean[maxChoosableInteger];
        nums=new int[maxChoosableInteger];
        int total=0;
        for(int i=0;i<maxChoosableInteger;i++){
            nums[i]=i+1;
            total+=nums[i];
        }
        if(total<desiredTotal)return false;
        return dfs(desiredTotal, 0);
    }

    public static boolean dfs(int desiredTotal, int sum){
        if(sum>=desiredTotal &&(step==0 || step%2==1)){
            System.out.println(step);
            return true;
        }
        boolean ans=false;
        for(int i=0;i<nums.length;i++){
            if(visited[i]!=true){
                visited[i]=true;
                sum+=nums[i];
                step+=1;
                ans=dfs(desiredTotal, sum);
                step-=1;
                sum-=nums[i];
                visited[i]=false;
            }
        }
        System.out.println(ans);
        return ans;
    }
    public static void main(String[] args){
        canIWin(10, 11);
    }
}
