package Lesson3;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Scanner;

public class Main {
    public static Period calculateAge(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today); // Return periods as Year, Month and Days
    }

    public static void main(String[] args){
//        Customer c0 = new Customer("Joe", "Smith", "332-221-4444");
//        Address c0B = new Address("", "Chicago", "", "");
//        Address c0S = new Address("", "Chicago", "", "");
//        c0.setBillingAddress(c0B);
//        c0.setShippingAddress(c0S);
//
//        Customer c1 = new Customer("Yan", "Smith", "332-221-4444");
//        Address c1B = new Address("", "LA", "", "");
//        Address c1S = new Address("", "LA", "", "");
//        c1.setBillingAddress(c1B);
//        c1.setShippingAddress(c1S);
//
//        Customer c2 = new Customer("Zhao", "Smith", "332-221-4444");
//        Address c2B = new Address("", "NY", "", "");
//        Address c2S = new Address("", "NY", "", "");
//        c2.setBillingAddress(c1B);
//        c2.setShippingAddress(c1S);
//
//        List<Customer> arrays = new ArrayList<Customer>();
//        arrays.add(c0);
//        arrays.add(c1);
//        arrays.add(c2);
//        for(Customer c: arrays){
//            if(c.getBillingAddress().getCity().equals("Chicago")){
//                System.out.println(c);
//                System.out.println(c.getBillingAddress());
//                System.out.println(c.getShippingAddress());
//            }
//        }

//        HeartRates heartRates = new HeartRates();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please, enter your first name:");
//        String firstName = sc.next();
//        heartRates.setFirstName(firstName);
//        System.out.println("Please, enter your last name:");
//        String lastName = sc.next();
//        heartRates.setLastName(lastName);
//        System.out.println("Please enter your birthday "
//                + "in yyyy-MM-dd format (e.g. 1980-9-28): ");
//        String birthDate = sc.next();
//        heartRates.setBirthDate(birthDate);
//        LocalDate birthday = LocalDate.parse(birthDate, formatter);
//        sc.close();
//        Period age = calculateAge(birthday);
//        System.out.printf("Today you are %d years, %d months"
//                        + " and %d days old%n",
//                age.getYears(), age.getMonths(), age.getDays());
//
//
//        int rhr = heartRates.getRHR();
//        int mhr = 220 - age.getYears();
//        int ahr = mhr - rhr;
//        double lb = 0.5;
//        double ub = 0.85;
//        double lbthr = (ahr * lb) + rhr;
//        double ubthr = (ahr * ub) + rhr;
//        System.out.println(rhr);
//        System.out.println(mhr);
//        System.out.println(ahr);
//        System.out.println(lbthr);
//        System.out.println(ubthr);
//        System.out.println("The Target Heart Rate Range is between " +lbthr+ " and " +ubthr);
//        System.out.println("First name : " + heartRates.getFirstName());
//        System.out.println("Last name : " + heartRates.getLastName());
//        System.out.println("Age : " + age.getYears());
//        System.out.println( "Date of Birth :" +heartRates.getBirthDate());
//        System.out.println("Maximum Heart Rate :" + mhr);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter C for Circle");
//        System.out.println("Enter R for Rectangle");
//        System.out.println("Enter T for Triangle");
//        String str = sc.next();
//        if(str.equals("C")){
//            System.out.println("Enter the radius of the Circle");
//            double radius = Double.valueOf(sc.next());
//            Circle  c = new Circle(radius);
//            System.out.println("The area of Rectangle is :" + c.computeArea(radius));
//        }else if(str.equals("R")){
//            System.out.println("Enter the width of the Rectangle");
//            double width = Double.valueOf(sc.next());
//            System.out.println("Enter the height of the Rectangle");
//            double height = Double.valueOf(sc.next());
//            Rectangle r = new Rectangle(width, height);
//            System.out.println("The area of Rectangle is :" + r.computeArea(width, height));
//        }else{
//            System.out.println("Enter the base of the Triangle");
//            double base = Double.valueOf(sc.next());
//            System.out.println("Enter the height of the Triangle");
//            double height = Double.valueOf(sc.next());
//            Triangle t = new Triangle(base, height);
//            System.out.println("The area of Rectangle is :" + t.computeArea(base, height));
//        }

    }
}
