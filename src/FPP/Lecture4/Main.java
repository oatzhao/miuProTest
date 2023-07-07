package FPP.Lecture4;

public class Main {
    public static void reverseNum(Integer num){
       if(num < 10){
           System.out.println(num);
           return;
       }else {
           System.out.print(num % 10);
           reverseNum(num / 10);
       }

    }


    static int count = 0;
    static int reverseDigits(int num) {

        if (num > 0) {
            reverseDigits(num / 10);

            count++;
        }
        return count;
    }

    public static int sum(int[] arr, int n){
        if (n <= 0) {
            return 0;
        }
        return  arr[n - 1]+ sum(arr, n - 1) ;
    }


    public static void main(String[] args){
        int n = 4567;
        reverseNum(n);

        System.out.println(reverseDigits(1234567));

        int[] arr = new int[]{12, 3, 4, 13};
        System.out.println(sum(arr, arr.length));
    }
}
