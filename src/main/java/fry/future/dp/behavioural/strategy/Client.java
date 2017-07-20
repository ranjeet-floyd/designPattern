package fry.future.dp.behavioural.strategy;

/**
 *
 * @author ranjeet
 */
public class Client {

    public static void main(String[] args) {

        Customer firstCustomer = new Customer(new NormalBillingStrategy());

        //normal billing
        firstCustomer.add(1.0, 1);

        //start happy hours
        firstCustomer.setStrategy(new HappyHoursStrategy());

        firstCustomer.add(1.0, 2);

        //pay bills
        firstCustomer.printBill(); // 2.0

        //other customer
        Customer secondCustomer = new Customer(new HappyHoursStrategy());
        secondCustomer.add(4.0, 1);
        //end happy hours
        secondCustomer.setStrategy(new NormalBillingStrategy());
        secondCustomer.add(1.0, 2);
        secondCustomer.add(2.0, 2);
        secondCustomer.printBill(); //8.0

    }

}
