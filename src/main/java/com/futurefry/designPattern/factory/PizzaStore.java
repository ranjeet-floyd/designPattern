package com.futurefry.designPattern.factory;

/**
 *
 * @author ranjeet
 */
public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {
        //any client can create pizza using now factory method.
        Pizza pizza = this.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
