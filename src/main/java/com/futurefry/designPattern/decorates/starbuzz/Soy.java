package com.futurefry.designPattern.decorates.starbuzz;

/**
 *
 * @author ranjeet
 */
public class Soy extends CondimentDecorator {

    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDesc() {

        return beverage.getDesc() + " , Soy";
    }

    @Override
    double cost() {
        return beverage.cost() + 4;
    }

}
