package Lecture3;

public class Circle {
    private double radius;

    public Circle(double radius){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea(double radius){
        return Math.PI * radius * radius;
    }
}
