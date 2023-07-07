package FPP.Lecture5.Company;

public class Company {
    private final String name;
    private int numOfEmployees;

    public Company(String name, int numOfEmployees) {
        this.name = name;
        this.numOfEmployees = numOfEmployees;
    }

    public String getName() {
        return name;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    private static void internalRules(){
        System.out.println("This is the internal rules.");
    }
}
