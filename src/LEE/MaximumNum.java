package LEE;

import java.util.Arrays;
import java.util.Stack;

public class MaximumNum {
    public static int[] maxNumber(int[] nums1, int[] nums2, int k) {
        if(nums1.length+nums2.length<k)return merge(nums1, nums2);
        int[] res= new int[k];
        for(int i=0;i<k;i++){
            int[] numA=removeKdigits(nums1, nums1.length-Math.min(i, nums1.length));
            int[] numB=removeKdigits(nums2, nums2.length-Math.min(k-i, nums2.length));
            int[] temp=merge(numA, numB);
            res=compare(res, temp);
        }
        return res;
    }

    public static int[] removeKdigits(int[] num, int k){
        Stack<Integer> stack =new Stack<>();
        int remain=num.length-k;
        for(int i=0;i<num.length;i++){
            while(!stack.isEmpty() && k>0 && stack.peek()<num[i]){
                stack.pop();
            }
            stack.add(num[i]);
        }

        int[] res=new int[remain];
        for(int i=remain-1;i>=0;i--){
            res[i]=stack.pop();
        }
        return res;
    }

    public static int[] merge(int[] A, int[] B){
        int[] res=new int[A.length+B.length];
        int cur=0, p1=0, p2=0;
        while(p1<A.length || p2<B.length){
            if(p1>=A.length){
                res[cur]=B[p2];
                p2++;
            }else if(p2>=B.length){
                res[cur]=A[p1];
                p1++;
            } else if(A[p1]>B[p2]){
                res[cur]=A[p1];
                p1++;
            }else{
                res[cur]=B[p2];
                p2++;
            }
            cur++;
        }
        return res;
    }

    public static int[] compare(int[] num1, int[] num2){
        if(num1.length!=num2.length) return num1.length>num2.length?num1:num2;
        for(int i=0;i<num1.length;i++){
            if(num1[i]==num2[i])continue;
            return num1[i]>num2[i]?num1:num2;
        }
        return num1;
    }

    public static void main(String[] args) {
        int[] nums1={6, 7};
        int[] nums2={6, 0, 4};
        merge(nums1, nums2);
        maxNumber(nums1, nums2, 5);
    }
}
