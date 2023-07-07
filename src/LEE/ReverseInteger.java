package LEE;

public class ReverseInteger {
    public static int reverse(int x){
        int flag = 1;
        if(x<0){
            flag = -1;
            x = -x;
        }

        int ans = 0;
        int tmp = 0;
        int tmpAns = 0;
        while (x!=0){
            tmp = x%10;
            tmpAns = ans*10 + tmp;
            if((tmpAns-tmp)/10 != ans) return 0;
            ans = tmpAns;
            x=x/10;
        }

        return ans*flag;
    }

    public static int reverse0(int x) {
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum += lastDig;
            finalNum = finalNum*10;
            x= x/10;
        }
        finalNum = finalNum/10;
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalNum);
        }
        return (int)finalNum;
    }

    public static void main(String[] args) {
        int x=1534236469;
        int y =reverse(x);
        System.out.println(y);

    }
}
