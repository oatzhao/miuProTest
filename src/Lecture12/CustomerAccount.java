package Lecture12;

public class CustomerAccount extends Exception{
    private String Cus_name;
    private String Acc_no;
    private double Balance = 10;

    public CustomerAccount(){};

    public CustomerAccount(String cus_name, String acc_no, double balance) {
        Cus_name = cus_name;
        Acc_no = acc_no;
        Balance = balance;
    }

    public boolean deposit(double amount){
        this.Balance += amount;
        if(this.Balance < 0)
            return false;
        return true;
    }

    public boolean withdraw(double amount){
        double tmp = this.Balance;
        this.Balance += amount;
        if(tmp <= this.Balance)
            return true;
        return false;
    }

    public double getBalance() {
        return Balance;
    }
}
