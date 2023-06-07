package Lecture5.Employee;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                               double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    double getPayment() {
        return baseSalary * (super.getGrossSales() * super.getCommissionRate());
    }

    @Override
    public String toString(){
        return "FirstName:"+this.getFirstName() +"LastName:"+this.getLastName()+"SocialSecurityNumber:"+this.getSocialSecurityNumber()
                +"baseSalary:"+baseSalary;
    }
}
