package com.futurefry.designPattern.singleton;

/**
 *
 * @author ranjeet
 */
public class APP {
    public static void main(String[] args) {
        ChocolateFactory chocolateFactory = ChocolateFactory.getInstance();
        chocolateFactory.fill();
        chocolateFactory.boil();
        chocolateFactory.drain();
        chocolateFactory.boil();
    }
    
}
