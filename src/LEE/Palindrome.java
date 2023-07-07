package LEE;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int ori = x;
        int newX = 0;
        int temp = 0;
        while (x!=0){
            temp = x%10;
            newX = newX * 10 + temp;
            x = x/10;
        }
        if(newX == ori) return true;
        return false;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
