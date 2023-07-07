package Mpp.Lab3.prob4;

public class House extends Building{
    private double lotSize;

    public House(double lotSize) {
        this.lotSize = lotSize;
    }

    public double computeRent(){
        return 0.1*lotSize;
    }
}
