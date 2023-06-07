package Lecture5.Employee;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    double getPayment() {
        return weeklySalary;
    }

    @Override
    public String toString(){
        return "FirstName:"+this.getFirstName() +"LastName:"+this.getLastName()+"SocialSecurityNumber:"+this.getSocialSecurityNumber()+"weeklySalary:"+this.weeklySalary;
    }
}
