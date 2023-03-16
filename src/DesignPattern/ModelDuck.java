package DesignPattern;

import DesignPattern.Fly.FlyNoWay;
import DesignPattern.Quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I am flying with a rocket!");
    }
}
