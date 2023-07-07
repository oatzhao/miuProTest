package Mpp.Lab3.prob3;

public class Circle{
    private double radius;

    public Circle(double radius1) {
        this.radius = radius1;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea(){
        return radius*radius*Math.PI;
    }
}
