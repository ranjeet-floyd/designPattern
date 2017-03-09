package com.futurefry.designPattern.factory;

/**
 *
 * @author ranjeet
 */
public class NYPizzaFactory extends SimplePizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        return new NYStyleCheesePizza();

    }

}
