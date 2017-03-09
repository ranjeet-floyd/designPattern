package com.futurefry.designPattern.templateMethodPattern;

/**
 *
 * @author ranjeet
 */
public class Tea extends CaffeinBeverage {

    @Override
    void brew() {
        System.out.println("Steeping  Tea bag.");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

}
