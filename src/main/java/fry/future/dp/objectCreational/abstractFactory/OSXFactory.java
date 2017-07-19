package fry.future.dp.objectCreational.abstractFactory;

/**
 *
 * @author ranjeet
 */
public class OSXFactory implements GUIFactory {

    /*
    Concrete Factory
     */
    @Override
    public Button createButton() {
        return new OSXButton();
    }

}
