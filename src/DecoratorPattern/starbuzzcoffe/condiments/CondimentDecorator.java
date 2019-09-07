package DecoratorPattern.starbuzzcoffe.condiments;

import DecoratorPattern.starbuzzcoffe.reverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
