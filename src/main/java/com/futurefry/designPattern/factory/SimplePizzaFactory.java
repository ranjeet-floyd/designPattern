package com.futurefry.designPattern.factory;

/**
 * It has one job in life, creating pizza for its client.
 *
 * @author ranjeet
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();

        } else if (type.equals("pepporoni")) {
            pizza = new Pepporoni();
        }

        System.out.println(type);
        return pizza;

    }

}
