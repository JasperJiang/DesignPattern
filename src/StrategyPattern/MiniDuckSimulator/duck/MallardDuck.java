package StrategyPattern.MiniDuckSimulator.duck;

import StrategyPattern.MiniDuckSimulator.fly.FlyWithWing;
import StrategyPattern.MiniDuckSimulator.quack.Squeak;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWing();
        quackBehavior = new Squeak();
    }
}
