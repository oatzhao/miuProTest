package Lecture5.DeptEmployee;

import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    public double salary;
    private LocalDate date;

    DeptEmployee(String name, double salary, LocalDate date){
        this.name  = name;
        this.salary = salary;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double computeSalary(){
        return salary;
    }
}
