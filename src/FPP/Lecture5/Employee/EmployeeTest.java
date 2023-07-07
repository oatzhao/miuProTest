package FPP.Lecture5.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e0 = new SalariedEmployee("AA", "ZZ", "12340", 1200);
        Employee e1 = new CommissionEmployee("BB", "ZZ", "12341", 5000, 20);
        Employee e2 = new HourlyEmployee("CC", "ZZ", "", 12342, 70);
        Employee e3 = new BasePlusCommissionEmployee("DD", "ZZ", "12343", 5000, 20, 1500);
        Employee e4 = new BasePlusCommissionEmployee("EE", "ZZ", "12344", 5000, 20, 6500);

        Employee[] employees ={e0, e1, e2, e3 ,e4};

        for(Employee employee: employees){
            System.out.println(employee.getPayment());
            System.out.println(employee.toString());
        }
    }
}
