package com.futurefry.designPattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ranjeet
 */
public class PanCakeHouseIterator implements Iterator<MenuItem> {

    private final List<MenuItem> menuItems;
    private int pos = 0;

    public PanCakeHouseIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return pos < menuItems.size() && null != menuItems.get(pos);
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(pos);
        pos += 1;
        return menuItem;
    }

}
