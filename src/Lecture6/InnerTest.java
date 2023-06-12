package Lecture6;

public class InnerTest {
    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.getName());
    }
}
