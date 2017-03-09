package com.futurefry.designPattern.adapterNFacade;

/**
 *
 * @author ranjeet
 */
public class APP {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();

        Duck turkeyAdaptoer = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says.....");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The duck says....");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("The adapter turkey says.......");
        turkeyAdaptoer.quack();
        turkeyAdaptoer.fly();
    }

}
