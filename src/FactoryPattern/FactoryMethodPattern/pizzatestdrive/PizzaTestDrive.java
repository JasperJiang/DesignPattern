package FactoryPattern.FactoryMethodPattern.pizzatestdrive;

import FactoryPattern.FactoryMethodPattern.pizzatestdrive.stores.NYPizzaStore;
import FactoryPattern.FactoryMethodPattern.pizzatestdrive.stores.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();

        pizzaStore.orderPizza("cheese");
    }
}
