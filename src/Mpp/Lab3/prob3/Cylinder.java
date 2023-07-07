package Mpp.Lab3.prob3;

public class Cylinder extends Circle{
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double computeVolume(){
        return super.computeArea()*height;
    }
}
