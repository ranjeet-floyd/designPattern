package com.futurefry.designPattern.factory;

/**
 *
 * @author ranjeet
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago style deep Dish Cheese Pizza";
        dough = "Extra thick Crust Dough";
        sauce = "Plum tomato Sauce";
        topings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut() {
        System.out.println("Cutting the Pizza in square slices");
    }

}
