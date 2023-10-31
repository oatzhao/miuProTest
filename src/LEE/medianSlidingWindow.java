package LEE;

import java.util.PriorityQueue;

public class medianSlidingWindow {
    static PriorityQueue<Integer> small=new PriorityQueue<>((a, b)->Integer.compare(b,a));
    static PriorityQueue<Integer> big=new PriorityQueue<>((a, b)->Integer.compare(a,b));

    public static double getMedian(int k){
        if(k%2!=0){
            return small.peek() * 0.1;
        }else{
            return small.peek()*0.5+big.peek()*0.5;
        }
    }

    public static double[] medianSlidingWindow(int[] nums, int k) {
        double[] res=new double[nums.length-k+1];

        for(int i=0;i<k;i++) small.add(nums[i]);
        for(int i=0;i<k/2;i++) big.add(small.poll());
        res[0]=getMedian(k);
        for(int i=k;i<nums.length;i++){
            int l=nums[i-k]; int r=nums[i];
            if(!small.isEmpty() && r<=small.peek()){
                small.add(r);
            }else{
                big.add(r);
            }

            if(!small.isEmpty() && l<=small.peek()){
                small.remove(l);
            }else{
                big.remove(l);
            }

            while(small.size()-big.size()>1) big.add(small.poll());
            while(big.size()>small.size()) small.add(big.poll());

            res[i-k+1]=getMedian(k);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] nums ={1,3,-1,-3,5,3,6,7};
        System.out.println(medianSlidingWindow(nums, 3));
    }
}
