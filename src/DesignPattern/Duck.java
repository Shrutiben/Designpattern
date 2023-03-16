package DesignPattern;
import DesignPattern.DuckVaries.MallardDuck;
public class Duck {

        public FlyBehavior flyBehavior;
        public QuackBehavior quackBehavior;

        public void performFly(){
            flyBehavior.fly();
        }
        public void performQuack(){
            quackBehavior.quack();
        }
  void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
//    public void setQuackBehavior(QuackBehavior qb) {
//        quackBehavior = qb;
//    }
}

