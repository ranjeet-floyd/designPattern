package com.futurefry.designPattern.iterator;

/**
 *
 * @author ranjeet
 */
public class APP {

    public static void main(String[] args) {
        PanCakeHouseMenu panCakeHouseMenu = new PanCakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        
        Waitress waitress = new Waitress(panCakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
    
}
