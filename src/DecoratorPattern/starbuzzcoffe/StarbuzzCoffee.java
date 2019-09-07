package DecoratorPattern.starbuzzcoffe;

import DecoratorPattern.starbuzzcoffe.condiments.Mocha;
import DecoratorPattern.starbuzzcoffe.condiments.Soy;
import DecoratorPattern.starbuzzcoffe.reverages.Beverage;
import DecoratorPattern.starbuzzcoffe.reverages.DarkRost;
import DecoratorPattern.starbuzzcoffe.reverages.Espresso;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRost();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }

}
