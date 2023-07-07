package Mpp.Lab5.prob1;

public class RubberDuck extends Duck implements FlyBehavior, QuackBehavior{
    @Override
    public void swim() {
        System.out.println("swimmng");
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
        System.out.println("squeaking");
    }
}
