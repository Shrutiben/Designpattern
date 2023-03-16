package DesignPattern.DuckVaries;

import DesignPattern.Duck;
import DesignPattern.Quack.Quack;
import DesignPattern.QuackBehavior;

public class RubberDuck extends Duck {
    public RubberDuck(){
        quackBehavior = new Quack();
    }
}
