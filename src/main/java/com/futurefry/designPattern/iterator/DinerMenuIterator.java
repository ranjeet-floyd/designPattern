package com.futurefry.designPattern.iterator;

import java.util.Iterator;

/**
 *
 * @author ranjeet
 */
public class DinerMenuIterator implements Iterator<MenuItem> {

    private final MenuItem[] menuItems;
    int pos = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return pos < menuItems.length && null != menuItems[pos];
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[pos];
        pos += 1;
        return menuItem;
    }

}
