package com.futurefry.designPattern.composite;

/**
 *
 * @author ranjeet
 */
public class Leaf implements Component {

    @Override
    public Composite getComposites() {
        return null;
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
