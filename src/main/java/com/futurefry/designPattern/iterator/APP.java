package com.futurefry.designPattern.iterator;

import java.util.Arrays;

/**
 *
 * @author ranjeet
 */
public class APP {

    public static void main(String[] args) {
        Menu panCakeHouseMenu = new PanCakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(Arrays.asList(panCakeHouseMenu,dinerMenu,cafeMenu));
        waitress.printMenu();
        
//        ListIterator
//Collection
    }

}
