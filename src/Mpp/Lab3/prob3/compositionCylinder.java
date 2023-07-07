package Mpp.Lab3.prob3;

public class compositionCylinder {
    private Circle circle;
    private double height;

    public compositionCylinder(Circle circle, double height) {
        this.circle = circle;
        this.height = height;
    }

    public double computeVolume(){
        return circle.computeArea()*height;
    }
}
