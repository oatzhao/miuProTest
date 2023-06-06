package Lecture5.Shape;

public class Rectangle extends Shape{
    private double width;
    private double height;

    Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * width + 2 * height;
    }
}
