package com.futurefry.designPattern.factory;

/**
 *
 * @author ranjeet
 */
public class CaliforniaPizzaFactory extends SimplePizzaFactory{

    @Override
    public Pizza createPizza(String type) {
        return new CaliforniaCheesePiza();
    }


}
