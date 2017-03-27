package com.futurefry.designPattern.iterator.composite;

/**
 *
 * @author ranjeet
 */
public interface MenuComponent {

    String getName();

    String getDescription();

    double getPrice();

    boolean isVegetarian();

    void print();

    void add(MenuComponent component);

    void remove(MenuComponent component);

    MenuComponent getChild(int i);
}
