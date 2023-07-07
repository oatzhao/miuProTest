package Mpp.Lab4;

public abstract class Employee {
    private String empId;
    private int month;
    private int year;

    public void print(){}

    public double calcGrossPay() {
        return 0.0;
    }

    public Paycheck calcCompensation(int month, int year){
        double p = this.calcGrossPay();
        Paycheck paycheck = new Paycheck();
        paycheck.setGrosspay(p);
        paycheck.setFica(p-p*0.23);
        paycheck.setState(p-p*0.05);
        paycheck.setLocal(p-p*0.01);
        paycheck.setMedicare(p-p*0.03);
        paycheck.setSocialSecurity(p-p*0.075);
        return paycheck;
    }
}
