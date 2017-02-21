package com.futurefry.designPattern.decorates.starbuzz;

/**
 *
 * @author ranjeet
 */
public class Expresso extends Beverage {

    public Expresso() {
    }

    @Override
    String getDesc() {
        return "Original Expresso.";
    }


    
    @Override
    double cost() {
        return 5;
    }

}
