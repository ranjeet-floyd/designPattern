package com.futurefry.designPattern.factory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ranjeet
 */
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;

    protected List<String> topings = new ArrayList<>();

    void prepare() {

        System.out.println("Prepare Pizza : " + name);
        System.out.println("Tossing dough.........");
        System.out.println("Adding sauce...........");
        System.out.println("Adding toppings........");
        topings.forEach((toping) -> {
            System.out.println("  " + toping);
        });
    }

    void bake() {
        System.out.println("Bake for 15 @ 350");
    }

    void cut() {
        System.out.println("Cut Pizza");
    }

    void box() {
        System.out.println("Box Pizza");
    }

    public String getName() {
        return name;
    }

}
