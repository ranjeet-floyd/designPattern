package com.futurefry.designPattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ranjeet
 */
public class Waitress {
    
    private final List<Menu> menus;
    
    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }
    
    public void printMenu() {
        
        System.out.println("Menu \n .");
        menus.forEach(m -> printMenu(m.createIterator()));
        
        
    }
    
    private void printMenu(Iterator<MenuItem> iterator) {
        
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.println(menuItem.getDescription() + "");
            System.out.println(" " + menuItem.getPrice());
        }
    }
    
}
