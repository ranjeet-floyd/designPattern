package com.futurefry.designPattern.templateMethodPattern;

/**
 *
 * @author ranjeet
 */
public class Coffee extends CaffeinBeverage {

    @Override
    void brew() {

        System.out.println("Driping Coffee though Filter.");
    }

    @Override
    void addCondiments() {

        System.out.println("Adding Sugar and Milk.");
    }

}
