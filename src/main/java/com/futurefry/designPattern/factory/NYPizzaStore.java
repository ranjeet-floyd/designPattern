package com.futurefry.designPattern.factory;

/**
 *
 * @author ranjeet
 */
public class NYPizzaStore extends  PizzaStore{

    private static final NYPizzaFactory PIZZA_FACTORY = new NYPizzaFactory();

    public NYPizzaStore() {
    }

    @Override
    protected Pizza createPizza(String type) {

        return PIZZA_FACTORY.createPizza(type);
        
    }

   
    
}
