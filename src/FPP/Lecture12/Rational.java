package FPP.Lecture12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rational {
    public static void Rational(int num) throws InputMismatchException {
        try {
            System.out.println(num);
            throw new UnsupportedOperationException();
        }catch (Exception x){
            throw new UnsupportedOperationException("The inputs not in the range of 0-100.");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Rational(input);
    }
}
