package Mpp.examPractice;

import java.util.List;

public class Employee {
    private String name;
    private List<Account> accounts;

    public Employee(String name) {
        this.name = name;
    }

    public List<Account> addAccount(Account account){
        this.accounts.add(account);
        return accounts;
    }

    public double computeUpdatedBalanceSum() {
        //implement
        return 0.0;
    }
}
