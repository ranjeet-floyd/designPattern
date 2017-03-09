package com.futurefry.designPattern.iterator;

import java.util.Iterator;

/**
 *
 * @author ranjeet
 */
public class DinerMenu {

    private static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    private final MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin) Bacon with letttuce & tomato on whole wheat ", true, 2.99);
        addItem("BLT", "Bacon with letttuce & tomato on whole wheat ", true, 2.99);
        addItem("Soup of day", "Soup of day, with a side potato of salad. ", true, 2.99);
    }

    public final void addItem(String name, String description, boolean vegetarian, double price) {

        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems > MAX_ITEMS) {
            System.out.println("Sorry, Menu is full.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    //depricated
//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }
//    
    public Iterator<MenuItem> createIterator() {

        return new DinerMenuIterator(menuItems);
    }

}
