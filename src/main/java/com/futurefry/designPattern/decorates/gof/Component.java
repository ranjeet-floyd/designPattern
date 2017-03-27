package com.futurefry.designPattern.decorates.gof;

/**
 *
 * @author ranjeet
 */
public class Component implements VisualComponent {

    private final VisualComponent visualComponent;

    public Component(VisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }

    @Override
    public void draw() {
        visualComponent.draw();
    }

    @Override
    public void resize() {
        visualComponent.resize();
    }

}
