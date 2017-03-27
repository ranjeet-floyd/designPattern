package com.futurefry.designPattern.iterator.composite;

/**
 *
 * @author ranjeet
 */
public class Waitress {

    MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printMenu() {

        menuComponent.print();
    }
}
