package DecoratorPattern.reverages;

/**
 * 深焙咖啡
 */
public class DarkRost extends Beverage{

    public DarkRost(){
        description = "DarkRost";
    }

    @Override
    public double cost(){
        return .99;
    }
}
