package LEE;

public class CountingBits {
    public static int[] countBits(int n) {
        int[] res=new int[n+1];
        for(int i=0;i<=n;i++){
            res[i]=count(i);
        }
        return res;
    }

    private static int count(int n){
        int count=0;
        while(n!=0){
            count+=n&1;
            n>>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countBits(5));
    }
}
