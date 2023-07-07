package Mpp.Lab3.prob4;

public class Condo extends Building{
    private int numFloors;

    public Condo(int numFloors) {
        this.numFloors = numFloors;
    }

    public double computeRent(){
        return 400*numFloors;
    }
}
