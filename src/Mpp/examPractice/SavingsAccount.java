package Mpp.examPractice;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accId, double balance, double interestRate) {
        super(accId, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double computeUpdatedBalance() {
        return this.getBalance() + interestRate * this.getBalance();
    }
}
