package FPP.Lecture5.Shape;

public class ShapeTest {
    public static void printTotal(Shape[] shapes){
        for(Shape shape : shapes){
            System.out.println(shape.calculateArea());
            System.out.println(shape.calculatePerimeter());
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Rectangle("black",2, 3);
        shapes[1] = new Circle("pink", 3);
        shapes[2] = new Square("white", 4, 4);
        shapes[3] = new Rectangle("bronize",4, 5);
        shapes[4] = new Circle("green", 6);
        shapes[5] = new Square("purple", 8, 8);
        printTotal(shapes);
    }
}
