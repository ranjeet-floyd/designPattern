package com.futurefry.designPattern.factory;

/**
 *
 * @author ranjeet
 */
public class CaliforniaCheesePiza extends Pizza {

    public CaliforniaCheesePiza() {
        name = "California Style Cheese Pizza";
        dough = "Thin crust douh";
        sauce = "No Sauce";
        topings.add("California topping.!! - 1");
        topings.add("California topping.!! - 2");
    }

}
