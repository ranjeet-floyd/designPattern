package com.futurefry.designPattern.singleton;

/**
 *
 * @author ranjeet
 */
public class ChocolateFactory {

    private boolean empty;
    private boolean boiled;

    private static final ChocolateFactory EAGER_INSTANCE = new ChocolateFactory();
    private static ChocolateFactory INSTANCE;
    private static ChocolateFactory LAZY_INSTANCE;
    private volatile static ChocolateFactory DOUBLY_CHECK_INSTANCE;

    public static ChocolateFactory getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new ChocolateFactory();
        }
        return INSTANCE;
    }

    public static ChocolateFactory getEagerInstance() {

        return EAGER_INSTANCE;
    }

    public static synchronized ChocolateFactory getSyncInstance() {
        System.out.println("Ask for instance");
        if (null == LAZY_INSTANCE) {
            LAZY_INSTANCE = new ChocolateFactory();
        }
        return LAZY_INSTANCE;
    }

    public static ChocolateFactory getDoublyCheckInstance() {
        if (null == DOUBLY_CHECK_INSTANCE) {
            synchronized (ChocolateFactory.class) {
                if (null == DOUBLY_CHECK_INSTANCE) {
                    DOUBLY_CHECK_INSTANCE = new ChocolateFactory();
                }

            }
        }
        return DOUBLY_CHECK_INSTANCE;
    }

    private ChocolateFactory() {
        empty = true;
        boiled = false;
        System.out.println("Instance created.");
    }

    public void fill() {
        if (empty) {
            empty = false;
            boiled = false;
            System.out.println("Fill");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            //drained the boiled milk chocolate
            empty = true;
            System.out.println("Drain");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            //boild milk and chocolate
            boiled = true;
            System.out.println("Boil");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void setBoiled(boolean boiled) {
        this.boiled = boiled;
    }

}
