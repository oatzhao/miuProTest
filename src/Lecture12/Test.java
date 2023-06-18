package Lecture12;

import java.util.logging.Logger;

public class Test {
    public static void main(String[] args){
        CustomerAccount c = new CustomerAccount();
        try {
            if(!c.withdraw(-100)){
               new  MyException();
            }
            c.deposit(10);
            if(c.getBalance() < 100){
                new MyException1();
            }
        }catch (Exception e){

        }
    }
}
