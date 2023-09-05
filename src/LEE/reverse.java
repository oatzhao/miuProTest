package LEE;

public class reverse {
    public static String reverseWords(String s) {
        String[] strs=s.trim().split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=strs.length-1;i<=0;i++){
            if(strs[i].equals(""))continue;
            res.append(strs[i]+" ");
        }
        return res.toString().trim();
    }


    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
        String b="";
        String a="";
        System.out.println(b.equals(a));
    }
}
