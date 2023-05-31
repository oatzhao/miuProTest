public class Prog5 {
    public static int[] combine(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        int i = 0;
        for (int x : a) { c[i] = x; i ++; }
        for (int x : b) { c[i] = x; i ++; }

        return c;
    }
    public static void main(String[] args){
        int[] a = new int[]{5, 6, -4, 3, 1};
        int[] b = new int[]{3, 8, 9, 11};
        int[] c = combine(a, b);
        for(int i = 0; i<c.length; i++){
            System.out.println(c[i]);
        }

    }
}
