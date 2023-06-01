package Lesson2;

public class Prog4 {
    public static void main(String[] args){
        float f1 = 1.27f;
        float f2 = 3.881f;
        float f3 = 9.6f;

        Integer ans1 = (int)f1 + (int)f2 + (int)f3;
        Integer ans2 = Math.round(Float.sum(Float.sum(f1, f2), f3));

        System.out.println(ans1);
        System.out.println(ans2);
    }
}
