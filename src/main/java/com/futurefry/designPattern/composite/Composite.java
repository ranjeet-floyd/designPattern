package com.futurefry.designPattern.composite;

/**
 *
 * @author ranjeet
 */
public class Composite implements Component {

    @Override
    public Composite getComposites() {
        return this;
    }

    @Override
    public void add(Component component) {
        
    }

    @Override
    public void remove(Component component) {
    }
}
