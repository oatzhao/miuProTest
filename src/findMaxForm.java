import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class findMaxForm {
    public int countVotes(int[] candinates){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<candinates.length;i++){
            int count=map.getOrDefault(candinates[i], 0);
            map.put(candinates[i], count+1);
        }
        int max=0;
        int candidate=candinates[0];
        for(Integer key: map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                candidate=key;
            }
        }
        return candidate;
    }

    public void sortColors(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int idx=0;
        while(idx<=r){
            if(nums[idx]==0){
                swap(nums, l, idx);
                idx++;
                l++;
            }else if(nums[idx]==1){
                idx++;
            }else{
                swap(nums, r, idx);
                r--;
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static int findMaxForm(String[] strs, int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for(String str:strs){
            int[] count=count(str);
            for(int i=m;i>=0;i--){
                for(int j=n;j>=0;j--){
                    int numsZero=count[0];
                    int numsOne=count[1];
                    if(i>=numsZero && j>=numsOne) dp[i][j]=Math.max(dp[i][j], dp[m-numsZero][n-numsOne]+1);
                }
            }
        }
        return dp[m][n];
    }
    public static int[] count(String s){
        int[] count=new int[2];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count[0]++;
            }else{
                count[1]++;
            }
        }
        return count;
    }

    public static List unionSortedSequences(int[] nums1, int[] nums2){
        int nums1Len=nums1.length;
        int nums2Len=nums2.length;
        int i=0, j=0;
        List<Integer> res =new ArrayList<>();
        while(i<nums1Len && j<nums2Len){
            if(nums1[i]<=nums2[j]){
                res.add(nums1[i]);
                i++;
            }else{
                res.add(nums2[j]);
                j++;
            }
        }
        while (i<nums1Len){
            res.add(nums1[i]);
            i++;
        }
        while (j<nums2Len){
            res.add(nums2[j]);
            j++;
        }
        for(int k=0;k<res.size();k++){
            if(k>0 && res.get(k)==res.get(k-1)){
                res.remove(k);
            }
        }
        return res;
    }

    public static int win(int[] nums){
        int len=nums.length;
        int[] dp=new int[len];
        int candidate=0;
        int count=0;
        Arrays.fill(dp, 1);
        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){
                if(nums[i]==nums[j])dp[i]+=1;
            }
            if(count<dp[i]){
                count=dp[i];
                candidate=nums[i];
            }
        }
        return candidate;
    }



    public static void main(String[] args) {
        //String[] strs = {"10","0001","111001","1","0"};
        //System.out.println(findMaxForm(strs, 5, 3));
        //System.out.println(((3>>1)^1));
        int[] nums1={1, 1, 3, 4, 5};
        int[] nums2={3, 4, 5, 6, 7};
        List<Integer>  tt=unionSortedSequences(nums1, nums2);
        System.out.println(tt.toString());
    }
}
