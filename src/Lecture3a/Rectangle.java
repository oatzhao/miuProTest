package Lecture3a;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length){

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double computeArea(double width, double length){
        return width * length;
    }
}
