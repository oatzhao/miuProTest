package LEE;

public class sqrt {
    public static int mySqrt(int x) {
        int l=1, r=x;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid<=x/mid){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return l-1;
    }
    public static void main(String[] args) {
        int x=2147395599;
        System.out.println(mySqrt(x));
    }
}
