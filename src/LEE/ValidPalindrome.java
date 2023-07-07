package LEE;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if(s == null) return false;
        if(s.isEmpty())return true;
        int i = 0;
        int j = s.length()-1;
        while (j>=i){
            System.out.println(j);
            System.out.println(i);
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }else if(Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }else {
                System.out.println(Character.toLowerCase(s.charAt(i)));
                System.out.println(Character.toLowerCase(s.charAt(j)));
                System.out.println("   ");
                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                    return false;
                }
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean a = isPalindrome(s);
        System.out.println(a);
    }
}
