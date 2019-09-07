package DecoratorPattern.starbuzzcoffe.reverages;

/**
 * 综合咖啡
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
