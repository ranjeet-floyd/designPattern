package com.futurefry.designPattern.adapterNFacade;

/**
 *
 * @author ranjeet
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {

        System.out.println("gobble Gobble !!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flyiing a short distance.");
    }

}
