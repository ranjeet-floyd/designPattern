package com.futurefry.designPattern.adapterNFacade;

/**
 * First we need to implement the interface that we are adapting.
 *
 * @author ranjeet
 */
public class TurkeyAdapter implements Duck {

    private final Turkey turkey;

    /*
    Get the referenace that we are adopting.
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /**
     * Translatet the method
     */
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 10; i++) {
            turkey.fly();
        }
    }

}
