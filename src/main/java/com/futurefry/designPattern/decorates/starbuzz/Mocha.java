package com.futurefry.designPattern.decorates.starbuzz;

/**
 *
 * @author ranjeet
 */
public class Mocha extends CondimentDecorator {

    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDesc() {
        return beverage.getDesc() + " ,Mocha";
    }

    @Override
    double cost() {
        return beverage.cost() + 4;

    }

}
