package StrategyPattern.MiniDuckSimulator;

import StrategyPattern.MiniDuckSimulator.duck.Duck;
import StrategyPattern.MiniDuckSimulator.duck.MallardDuck;
import StrategyPattern.MiniDuckSimulator.duck.ModelDuck;
import StrategyPattern.MiniDuckSimulator.fly.FlyRocketPowered;

/**
 * 策略模式 Strategy Pattern
 */
public class MiniDuckSimulator {
    public static void main(String[] arg){
        System.out.println("========== mallardDuck ==========");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("========== modelDuck ==========");
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        mallardDuck.performFly();

    }
}
