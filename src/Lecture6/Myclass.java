package Lecture6;

public class Myclass {
    private String s = "hello";
    public static void main(String [] args){
        new Myclass();
    }
    Myclass(){
//        MyInnerClass myInnerClass = new MyInnerClass();
//        System.out.println(myInnerClass.intval);
//        myInnerClass.innerMethod();
       MyStaticNestedClass .myStaticMethod();
       MyStaticNestedClass cl = new MyStaticNestedClass();
       cl.myOtherMethod();
    }
    private class MyInnerClass{
        private int intval = 3;
        private void innerMethod(){
            System.out.println(s);
        }
    }

    static class MyStaticNestedClass{
        private int x = 0;
        static void myStaticMethod(){

        }
        private void myOtherMethod(){
        }
    }
}

class AnotherClass{
    public static void main(String [] args){
        Myclass.MyStaticNestedClass cl = new Myclass.MyStaticNestedClass();
        Myclass m = new Myclass();
    }
}
