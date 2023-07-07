package FPP.Lecture12;

//public class Test {
//    public static void test()throws Exception{
//        try {
//            throw new Throwable("First");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//            throw new Throwable("Second");
//        }finally {
//            System.out.println("finally!");
//        }
//    }
//    public static void main(String[] args){
//        CustomerAccount c = new CustomerAccount();
//        try {
//            if(!c.withdraw(-100)){
//               new  MyException();
//            }
//            c.deposit(10);
//            if(c.getBalance() < 100){
//                new MyException1();
//            }
//        }catch (Exception e){
//
//        }
//        try {
//            test();
//        }catch (Exception e){
//            System.out.println("main information:"+e.getMessage());
//        }
//    }
//}

class Test{
    public static void test() throws Exception {
        try {
// return; // 1
// System.exit(0); // 2
            throw new Exception("first"); // 3a
        }
        catch (Exception x){
            System.out.println(x.getMessage());
            throw new Exception("second"); // 3b
        }
        finally {
            System.out.println("finally!");
        }
//        System.out.println("last statement");
    }
    public static void main(String[] args){
        try{
            test();
        }
        catch(Exception x){
            System.out.println("main:"+x.getMessage());
        }
    }
}
