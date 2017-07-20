package fry.future.dp.behavioural.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ranjeet
 */
public class Customer {

    private final List<Double> drinks;
    //composition
    private BillingStrategy strategy;

    public Customer(BillingStrategy strategy) {
        this.drinks = new ArrayList<>();
        this.strategy = strategy;
    }

    public void add(double price, int quantity) {
        drinks.add(strategy.getActPrice(price * quantity));
    }

    /*
    Print bill for customers
     */
    public void printBill() {

        double sum = 0;

        sum = drinks.stream()
                .reduce(sum, (accumulator, _item) -> accumulator + _item);
        System.out.println("Total due amount : " + sum);
        drinks.clear();
    }

    public void setStrategy(BillingStrategy strategy) {
        this.strategy = strategy;
    }

}
