package StrategyPattern.MiniDuckSimulator.duck;

import StrategyPattern.MiniDuckSimulator.fly.FlyBehavior;
import StrategyPattern.MiniDuckSimulator.quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
