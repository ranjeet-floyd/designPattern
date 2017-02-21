package com.futurefry.designPattern.decorates.starbuzz;

/**
 *
 * @author ranjeet
 */
public class Whip extends CondimentDecorator {

    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDesc() {

        return beverage.getDesc() + ", Whip";
    }

    @Override
    double cost() {
        return beverage.cost() + 4;
    }

}
