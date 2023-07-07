package FPP.Lecture3b;

class Account {
    //instance variable
    public String name;
    public double balance;
    public static String accountNum = "";
    public static String service = "";

    // Instance Initialization Block
    {
        System.out.println("IIB block0");
    }

    {
        System.out.println("IIB block1");
    }

    //static initialization block
    static
    {
        System.out.println("STATIC BLOCK0");
    }

    {
        System.out.println("STATIC BLOCK1");
    }

    //constructors
    public Account() {
        System.out.println("this is a constructor");
    }

    public Account(String name, String accountNum, Double balance){
        System.out.println("this is another constructor");
    }

    //instance method
    public void owner(String name) { this.name = name; }
    public void balance(double balance) { this.balance = balance; }

    //static instance method
    public static void accountNum(String num)
    {
        accountNum = num;
    }

    public static void service(String serviceName)
    {
        service = serviceName;
    }
}

class BankProgram {
    public static void main(String[] args){
        Account ac = new Account();
        Account ac0 = new Account("sushan", "1234567", 8888888.0);

        ac.owner("zy");
        ac.balance(88888888);
        System.out.println(ac.name);
        System.out.println(ac.balance);

        Account.accountNum("6666668");
        System.out.println(Account.accountNum);
        Account.service("fraud awoke");
        System.out.println(Account.service);



        System.out.println("*");
        System.out.println("*");
        System.out.println();
        System.out.println("*");
        System.out.println("*");


    }
}