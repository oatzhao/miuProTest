package Mpp.Lab5.prob2;

public final class Triangle implements IShape{
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double computeArea() {
        return 0.5 * base * height;
    }
}
