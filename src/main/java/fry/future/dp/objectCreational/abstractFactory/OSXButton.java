package fry.future.dp.objectCreational.abstractFactory;

/**
 *
 * @author ranjeet
 */
public class OSXButton implements Button {

    /*
    Concrete Product
     */
    @Override
    public void paint() {
        System.out.println("Paint like OSX Button");
    }

}
