package Mpp.examPractice;

public class CheckingAccount extends Account{
    private double monthlyFee;

    public CheckingAccount(String accId, double monthlyFee, double balance) {
        super(accId, balance);
        this.monthlyFee = monthlyFee;
    }

    @Override
    public double computeUpdatedBalance() {
        return this.getBalance() - monthlyFee;
    }
}
