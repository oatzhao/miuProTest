package FPP.Lecture5.Shape;

public class Square extends Rectangle{
    Square(String color, double width, double height) {
        super(color, width, height);
    }

    @Override
    public double calculateArea() {
        return  super.calculateArea() ;
    }

    @Override
    public double calculatePerimeter() {
        return super.calculatePerimeter();
    }
}
