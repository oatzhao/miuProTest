package Lecture2;

public class Prog1 {
    public static void main(String[] args){
        RandomNumbers rn = new RandomNumbers();

        //Pro-1
        int x = rn.getRandomInt(1, 9);
        System.out.println(Math.pow(Math.PI,x));
        int y = rn.getRandomInt(3, 14);
        System.out.println(Math.pow(y,Math.PI));
   }
}
