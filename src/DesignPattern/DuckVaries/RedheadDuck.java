package DesignPattern.DuckVaries;

import DesignPattern.Duck;
import DesignPattern.Fly.FlyWithWings;
import DesignPattern.Quack.Quack;

public class RedheadDuck extends Duck{
public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior=new Quack();
    }
}
