package com.futurefry.designPattern.factory;

/**
 *
 * @author ranjeet
 */
public class ChicagoPizzaStore extends PizzaStore {

    private static final ChicagoPizzaFactory CHICAGO_PIZZA_FACTORY = new ChicagoPizzaFactory();

    @Override
    protected Pizza createPizza(String type) {
        return CHICAGO_PIZZA_FACTORY.createPizza(type);

    }

}
