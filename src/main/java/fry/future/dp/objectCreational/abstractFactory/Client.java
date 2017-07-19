package fry.future.dp.objectCreational.abstractFactory;

import java.util.Random;

/**
 * Client code
 *
 * @author ranjeet
 */
public class Client {

    //OS constants
    private static final String OSX = "OSX";
    private static final String WINDOWS = "Windows";
    private static final String ERROR = "error";
    /*
    Provide the interface for creating families of related or dependent 
    object 
    without specifying their concrete class.
     */
    public static void main(String[] args) throws Exception {

        GUIFactory factory = null;
        final String apperance = randomApperance();
        if (apperance.equals(OSX)) {
            factory = new OSXFactory();
        } else {

            if (apperance.equals(WINDOWS)) {
                factory = new WinFactory();
            } else {
                throw new Exception("No Such Operating System");
            }

        }

        //get concrete factory
        Button button = factory.createButton();
        //get concrete Product
        button.paint();

    }

    /*
    utils to random choose OS
     */
    private static String randomApperance() {

        final String[] apperanceArray = new String[3];
        apperanceArray[0] = OSX;
        apperanceArray[1] = WINDOWS;
        apperanceArray[2] = ERROR;

        final Random random = new Random();
        final int randomNumber = random.nextInt(3);
        return apperanceArray[randomNumber];
    }
}
