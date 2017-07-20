package fry.future.dp.behavioural.strategy;

/**
 *
 * @author ranjeet
 */
public class HappyHoursStrategy implements BillingStrategy {

    /*
    50% discount
     */
    @Override
    public double getActPrice(double rawPrice) {
        return rawPrice * 0.5;
    }

}
