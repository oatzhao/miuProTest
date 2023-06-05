package Lecture3a;

public class Triangle {
    private double base;
    public double height;

    public Triangle(double base, double height){

    }

    public double getBase() {
        return base;
    }

    public void setBase(double length) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double computeArea(double base, double height){
        return 0.5 * base * height;
    }
}
