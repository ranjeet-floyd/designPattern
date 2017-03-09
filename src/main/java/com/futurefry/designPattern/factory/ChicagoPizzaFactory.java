package com.futurefry.designPattern.factory;

/**
 *
 * @author ranjeet
 */
public class ChicagoPizzaFactory extends SimplePizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        return new ChicagoStyleCheesePizza();
    }

}
