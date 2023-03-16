package DesignPattern;

import DesignPattern.DuckVaries.MallardDuck;
import DesignPattern.DuckVaries.RubberDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

//        Duck rubber = new RubberDuck();
//        rubber.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
