package Mpp.Lab4;

public class Paycheck {
    private double grosspay;
    private double fica;
    private double state;
    private double local;
    private double medicare;
    private double socialSecurity;

    public void print(){

    }

    public double getNetPay(){
        return 0.0;
    }

    public double getGrosspay() {
        return grosspay;
    }

    public void setGrosspay(double grosspay) {
        this.grosspay = grosspay;
    }

    public double getFica() {
        return fica;
    }

    public void setFica(double fica) {
        this.fica = fica;
    }

    public double getState() {
        return state;
    }

    public void setState(double state) {
        this.state = state;
    }

    public double getLocal() {
        return local;
    }

    public void setLocal(double local) {
        this.local = local;
    }

    public double getMedicare() {
        return medicare;
    }

    public void setMedicare(double medicare) {
        this.medicare = medicare;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(double socialSecurity) {
        this.socialSecurity = socialSecurity;
    }
}
