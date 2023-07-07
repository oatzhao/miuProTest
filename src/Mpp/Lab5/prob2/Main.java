package Mpp.Lab5.prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IShape> list = new ArrayList<>();
        Rectangle R = new Rectangle(2, 3);
        Circle C = new Circle(3);
        Triangle T = new Triangle(3, 6);

        list.add(R);
        list.add(C);
        list.add(T);

        for(IShape shape:list){
            System.out.println(shape.computeArea());
        }
    }
}
