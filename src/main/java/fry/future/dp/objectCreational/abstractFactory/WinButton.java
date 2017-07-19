package fry.future.dp.objectCreational.abstractFactory;

/**
 *
 * @author ranjeet
 */
public class WinButton implements Button {

    /*
    Concrete Product
     */
    @Override
    public void paint() {

        System.out.println("Paint like Windows button");
    }

}
