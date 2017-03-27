package com.futurefry.designPattern.decorates.gof;

/**
 *
 * @author ranjeet
 */
public class App {

    public static void main(String[] args) {
        VisualComponent vc = new TextViewVisualComponent();
        vc.draw();

        System.out.println("-----Simple  component-------");
        VisualComponent vc1 = new Component(vc);
        vc1.draw();
        System.out.println("--------Added Border----");
        VisualComponent vc2 = new BorderComponent(2, vc1);
        vc2.draw();

    }

}
