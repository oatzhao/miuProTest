package Mpp.examPractice;

abstract class Account {
    private String accountId;
    private double balance;

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public Account(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public abstract double computeUpdatedBalance();
}
