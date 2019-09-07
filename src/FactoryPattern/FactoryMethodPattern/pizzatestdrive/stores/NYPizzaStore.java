package FactoryPattern.FactoryMethodPattern.pizzatestdrive.stores;


import FactoryPattern.FactoryMethodPattern.pizzatestdrive.pizzas.NYStyleCheesePizza;
import FactoryPattern.FactoryMethodPattern.pizzatestdrive.pizzas.Pizza;

/**
 * NYPizzaStore
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")){
            return new NYStyleCheesePizza();
        }else {
            return null;
        }
    }
}
