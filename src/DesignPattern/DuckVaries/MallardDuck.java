package DesignPattern.DuckVaries;

import DesignPattern.Duck;
import DesignPattern.Fly.FlyWithWings;
import DesignPattern.Quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior=new Quack();
    }
}
