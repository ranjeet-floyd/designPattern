package com.futurefry.designPattern.iterator.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ranjeet
 */
public class Menu implements MenuComponent {

    private final List<MenuComponent> menuComponents;
    private final String name;
    private final String description;

    public Menu(String name, String description) {
        this.menuComponents = new ArrayList<>();
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isVegetarian() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(" ," + getDescription());
        System.out.println("----------------------");

        Iterator<MenuComponent> iterator = menuComponents.iterator();

        iterator.forEachRemaining(m -> {
            m.print();
        });

    }

    @Override
    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    public MenuComponent getChild(int i) {

        return menuComponents.get(i);
    }

    @Override
    public void remove(MenuComponent component) {

        menuComponents.remove(component);
    }

}
