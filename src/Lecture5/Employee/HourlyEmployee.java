package Lecture5.Employee;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString(){
        return "FirstName:"+this.getFirstName() +"LastName:"+this.getLastName()+"SocialSecurityNumber:"+this.getSocialSecurityNumber()
                +"wage:"+wage+"hours:"+hours;
    }
}
