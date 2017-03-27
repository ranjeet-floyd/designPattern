package com.futurefry.designPattern.decorates.gof;

/**
 *
 * @author ranjeet
 */
public class BorderComponent extends Component {

    private final int width;

    public BorderComponent(int width, VisualComponent visualComponent) {
        super(visualComponent);
        this.width = width;
    }

    public void drawBorder(int width) {

        System.out.println("Added border of width :" + width);
    }

    @Override
    public void draw() {
        super.draw();
        this.drawBorder(width);

    }

}
