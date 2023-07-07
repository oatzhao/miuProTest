package FPP.Lecture5.DeptEmployee;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
    private double overtimeHours;

    Secretary(String name, double salary, LocalDate date, double overtimeHours) {
        super(name, salary, date);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary(){
        return super.computeSalary() * 12 * overtimeHours;
    }
}
