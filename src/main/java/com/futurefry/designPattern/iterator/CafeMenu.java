package com.futurefry.designPattern.iterator;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author ranjeet
 */
public class CafeMenu implements Menu {

    private final Map<String, MenuItem> menuItems;

    public CafeMenu() {
        this.menuItems = new Hashtable<>();
        addMenu("Veggie Burger and Air Fries", "Veggie burger on wheole wheat bun, lettuco , tomato and fries", true, 3.99);
        addMenu("Soup of day", "A cup of soup of day with a side salad", true, 3.69);
        addMenu("Burrito", "A large burrito with whole pinto beans, salsa, guacamole", true, 4.29);
    }

    private void addMenu(String name, String description, boolean vegeterian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegeterian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

//    public Map<String, MenuItem> getMenuItems() {
//        return menuItems;
//    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }

}
