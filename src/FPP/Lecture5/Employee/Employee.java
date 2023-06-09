package FPP.Lecture5.Employee;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    abstract double getPayment();

    Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    };

//    @Override
//    public String toString(){
//        return "FirstName:"+this.getFirstName() +"LastName:"+this.getLastName()+"SocialSecurityNumber:"+this.getSocialSecurityNumber();
//    }
}
