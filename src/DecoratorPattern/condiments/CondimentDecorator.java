package DecoratorPattern.condiments;

import DecoratorPattern.reverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
