package com.futurefry.designPattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ranjeet
 */
public class PanCakeHouseMenu {

    private final List<MenuItem> menuItems;

    public PanCakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake breakfast.", "Pancake with scrambled eggs and toast.", true, 2.99);
        addItem("Regular Pancake breakfast", "Pancakes with fried eggs and sauce", true, 2.99);
        addItem("BlueBerry  pancakes", "Pancake made with fresh Blueberries", true, 3.49);
        addItem("Waffles", "Waffles , with your choice of blueberries or strawberries", true, 3.59);

    }

    public final void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

//    @Deprecated
//    public List<MenuItem> getMenuItems() {
//        return menuItems;
//    }
    public Iterator<MenuItem> createIterator() {

        return new PanCakeHouseIterator(menuItems);
    }
}
