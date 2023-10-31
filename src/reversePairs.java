import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;

public class reversePairs {
    static int res=0;
    public static int reversePairs(int[] nums) {
        mergeSort(nums, nums.length);
        return res;
    }

    public static void mergeSort(int[] nums, int n){
        if(n<2) return;
        int mid=n/2;
        int[] left=new int[mid];
        int[] right=new int[n-mid];
        for(int i=0;i<mid;i++){
            left[i]=nums[i];
        }
        for(int i=mid;i<n;i++){
            right[i-mid]=nums[i];
        }
        mergeSort(left, mid);
        mergeSort(right, n-mid);

        int i=0,j=0;
        while(i<mid && j<n-mid){
            if((long)left[i]>(long)2*right[j]){
                res+=mid-i;
                j++;
            }else{
                i++;
            }
        }

        merge(nums, left, right, mid, n-mid);
    }
    public static void merge(int[] nums, int[] left, int[] right, int l, int r){
        int k=0, i=0, j=0;
        while(i<l && j<r){
            if(left[i]<=right[j]){
                nums[k++]=left[i++];
            }else{
                nums[k++]=right[j++];
            }
        }

        while(i<l){
            nums[k++]=left[i++];
        }
        while(j<r){
            nums[k++]=right[j++];
        }
    }
    public static void main(String[] args) {
        int[] nums={1,3,2,3,1};
        System.out.println(reversePairs(nums));
    }
}
