package LEE;

import java.util.Arrays;
import java.util.Map;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;
        int i = m-1;
        int j = n-1;

        while (j>=0){
            if(i>=0 && (nums1[i]> nums2[j])){
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{2, 0};
        int m = 1;
        int[] num2 = new int[]{1};
        int n = 1;

        merge(num1, 1, num2, 1);
    }
}
