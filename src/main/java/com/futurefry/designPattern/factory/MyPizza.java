package com.futurefry.designPattern.factory;

/**
 *
 * @author ranjeet
 */
public class MyPizza {

    public static void main(String[] args) {

        //NY Pizza franchise
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chPizzaStore = new ChicagoPizzaStore();

        Pizza ethanPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a  " + ethanPizza.getName());
        Pizza joelPizza = chPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + joelPizza.getName());

        //california
        PizzaStore caliPizzaStore = new CaliforniaPizzaStore();
        Pizza caliPizza = caliPizzaStore.createPizza("cheese");
        
        System.out.println("California Pizza :" + caliPizza.getName());
    }

}
