package Mpp.Lab4;

public class Hourly extends Employee{
    private int hourlyWage;
    private int hoursPerWeek;

    public double calcGrossPay(){
        return hourlyWage*hourlyWage;
    }

}
