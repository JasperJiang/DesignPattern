package StrategyPattern.MiniDuckSimulator.duck;

import StrategyPattern.MiniDuckSimulator.fly.FlyNoWay;
import StrategyPattern.MiniDuckSimulator.quack.Squeak;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
}
