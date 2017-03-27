package com.futurefry.designPattern.iterator.composite;

/**
 *
 * @author ranjeet
 */
public class APP {

    public static void main(String[] args) {
        MenuComponent panCakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");

        MenuComponent dinerMenu = new Menu("DINER MENU", "LUNCH");

        MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(panCakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        //add break
        panCakeHouseMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce", true, 3.89));

        //add lunch
        dinerMenu.add(new MenuItem("Desset", "tasty ", true, 3.56));

        //add dinner
        cafeMenu.add(new MenuItem("Dinner Menu", "tasty dinner ", true, 3.9));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }

}
