package com.futurefry.designPattern.decorates.starbuzz;

/**
 *
 * @author ranjeet
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
    }

    @Override
    String getDesc() {
        return "HouseBlend";
    }

    
    @Override
    double cost() {
        return 6;
    }

}
