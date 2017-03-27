package com.futurefry.designPattern.decorates.gof;

/**
 *
 * @author ranjeet
 */
public class TextViewVisualComponent implements VisualComponent {

    @Override
    public void draw() {
        System.out.println("Draw Text view Visual Component");
    }

    @Override
    public void resize() {
        System.out.println("Resize text view visual component");
    }

}
