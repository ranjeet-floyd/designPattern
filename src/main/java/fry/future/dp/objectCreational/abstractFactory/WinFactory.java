package fry.future.dp.objectCreational.abstractFactory;

/**
 *
 * @author ranjeet
 */
public class WinFactory implements GUIFactory {

    /*
    Concrete Factory
     */
    @Override
    public Button createButton() {
        return new WinButton();
    }

}
