package com.futurefry.designPattern.templateMethodPattern;

/**
 *
 * @author ranjeet
 */
public abstract class CaffeinBeverage {

    final void prepareRecipe() {

        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling Water.");
    }

    void pourInCup() {
        System.out.println("Pour in Cup.");
    }
}
