package FactoryPattern.FactoryMethodPattern.pizzatestdrive.stores;

import FactoryPattern.FactoryMethodPattern.pizzatestdrive.pizzas.Pizza;

/**
 * abstract PizzaStore
 */
public abstract class PizzaStore {

    public void orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }

    abstract Pizza createPizza(String type);

}
