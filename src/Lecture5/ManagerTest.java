package Lecture5;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Benny", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        EmployeeTemp[] staff = new EmployeeTemp[3];
        staff[0] = boss;
        staff[1] = new EmployeeTemp("Jimmy", 50000, 1989, 10, 1);
        staff[2] = new EmployeeTemp("Tommy", 40000, 1990, 3, 15);

        for (EmployeeTemp e : staff) {
            System.out.println("name" + e.getName() + "salary" + e.getSalary());
        }
    }
}
