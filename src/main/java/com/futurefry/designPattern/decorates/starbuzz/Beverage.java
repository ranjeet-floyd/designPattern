package com.futurefry.designPattern.decorates.starbuzz;

/**
 *
 * @author ranjeet
 */
public abstract class Beverage {

    private String desc = "Unknown Beverage. !!";

    String getDesc() {
        return desc;
    }

    abstract double cost();

}
