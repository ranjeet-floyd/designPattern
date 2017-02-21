package com.futurefry.designPattern.decorates.starbuzz;

/**
 *
 * @author ranjeet
 */
public class StartbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Expresso();

        System.out.println(beverage.getDesc() + " $" + beverage.cost());
        
        //
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        
//        BufferedInputStream
//PushbackInputStream
        
        System.out.println(beverage1.getDesc() + " $" + beverage1.cost());
    }

}
