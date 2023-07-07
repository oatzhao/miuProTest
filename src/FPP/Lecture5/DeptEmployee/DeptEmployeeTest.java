package FPP.Lecture5.DeptEmployee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DeptEmployeeTest {
    public static void main(String[] args) {
        DeptEmployee p1 = new Professor("RAJU AHMED", 120000.0, LocalDate.parse("12/03/2000", DateTimeFormatter.ofPattern("MM/dd/yyyy")), 5);
        DeptEmployee p2 = new Professor("ABDUR RAHIM", 115000.0, LocalDate.parse("12/03/2000", DateTimeFormatter.ofPattern("MM/dd/yyyy")), 5);
        DeptEmployee p3 = new Professor("ANISUL KARIM", 105000.0, LocalDate.parse("12/03/2001", DateTimeFormatter.ofPattern("MM/dd/yyyy")), 5);

        DeptEmployee s1 = new Secretary("LISA", 98000.0, LocalDate.parse("12/02/2014", DateTimeFormatter.ofPattern("MM/dd/yyyy")), 59.5);
        DeptEmployee s2 = new Secretary("MELISA", 850000.0, LocalDate.parse("12/02/2018", DateTimeFormatter.ofPattern("MM/dd/yyyy")), 59.5);

        DeptEmployee[] deptEmployees = new DeptEmployee[5];
        deptEmployees[0] = p1;
        deptEmployees[1] = p2;
        deptEmployees[2] = p3;
        deptEmployees[3] = s1;
        deptEmployees[4] = s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to see total salary(Y/N): ");
        String input = sc.nextLine();
        if (input.equals("Y")) {
            double totalSalary = 0.0;
            for (int i = 0; i < deptEmployees.length; i++) {
                System.out.println("Original Salary: " + deptEmployees[i].salary);
                System.out.println("Calculate Salary: " + deptEmployees[i].computeSalary());
                totalSalary += deptEmployees[i].computeSalary();
            }
            System.out.println("Total Salary: " + totalSalary);
        }
    }
}
