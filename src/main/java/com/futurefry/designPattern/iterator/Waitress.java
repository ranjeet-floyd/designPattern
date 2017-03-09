package com.futurefry.designPattern.iterator;

import java.util.Iterator;

/**
 *
 * @author ranjeet
 */
public class Waitress {

    private final PanCakeHouseMenu panCakeHouseMenu;
    private final DinerMenu dinerMenu;

    public Waitress(PanCakeHouseMenu panCakeHouseMenu, DinerMenu dinerMenu) {
        this.panCakeHouseMenu = panCakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> panCakeHouseIterator = panCakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();

        System.out.println("Menu \n ..........BreakFast");
        printMenu(panCakeHouseIterator);

        System.out.println("\n Lunch");

        printMenu(dinerIterator);

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
