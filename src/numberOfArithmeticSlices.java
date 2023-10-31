import java.util.LinkedList;

public class numberOfArithmeticSlices {
    static int res=0;
    static LinkedList<Integer> path=new LinkedList<>();
    public static int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        dfs(0, 0, nums, n);
        return res;
    }

    public static void dfs(int index, int val, int[] nums, int n){
        if(path.size()>=3){
            //System.out.println(path);
            res+=1;

        }
        for(int i=0;i<n;i++){
            int eval=nums[i+1]-nums[i];
            if(i+1<n && nums[i+1]-nums[i]==val || i==n-1){
                path.add(nums[i]);
                System.out.println(path);
                dfs(index+1, eval, nums, n);
                path.remove();
            }else{
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums =new int[]{1,2,3,4};
        System.out.println(numberOfArithmeticSlices(nums));
    }
}
