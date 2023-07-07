package Mpp.Lab5.prob1;

public class DecoyDuck extends Duck implements FlyBehavior, QuackBehavior{
    @Override
    public void swim() {
        System.out.println("swimming");
    }

    @Override
    public void diplay() {
        System.out.println("displaying");
    }

    @Override
    public void fly() {
        System.out.println("cannot fly");
    }

    @Override
    public void quack() {
        System.out.println("cannot quack");
    }
}
