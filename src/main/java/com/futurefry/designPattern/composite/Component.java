package com.futurefry.designPattern.composite;

/**
 *
 * @author ranjeet
 */
public interface Component {
    
    Composite getComposites();
    void add(Component component);
    void remove(Component component);
}
