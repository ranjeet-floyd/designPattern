package com.futurefry.designPattern.factory;

/**
 *
 * @author ranjeet
 */
public class CaliforniaPizzaStore extends PizzaStore {

    private static final CaliforniaPizzaFactory CALIFORNIA_PIZZA_FACTORY = new CaliforniaPizzaFactory();

    @Override
    protected Pizza createPizza(String type) {
        return CALIFORNIA_PIZZA_FACTORY.createPizza(type);
    }

}
