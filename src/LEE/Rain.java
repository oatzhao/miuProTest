package LEE;

public class Rain {
    public static int trap(int[] height){
        if(height==null || height.length==0) return 0;
        int l=0;
        int r=height.length-1;
        int res=0;
        int maxL=height[l];
        int maxR=height[r];
        while(l<r){
            if(maxL<maxR){
                l++;
                maxL=Math.max(maxL, height[l]);
                res+=(maxL-height[l]);
            }else{
                r--;
                maxR=Math.max(maxR, height[r]);
                res+=(maxR-height[r]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
