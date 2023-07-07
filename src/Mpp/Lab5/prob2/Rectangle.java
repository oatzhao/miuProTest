package Mpp.Lab5.prob2;

public final class Rectangle implements IShape{
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double computeArea() {
        return width * height;
    }
}
