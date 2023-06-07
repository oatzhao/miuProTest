package Lecture5;

public class Manager extends EmployeeTemp {
    private double bonus;

    public Manager(String aName, double aSalary, int aYear, int aMonth, int aDay) {
        super(aName, aSalary, aYear, aMonth, aDay);
        bonus = 0;
    }

    @Override
    public double getSalary(){
        double baseSalary = super .getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b){bonus = b;}
    public double getBonus(){return bonus;}
}
