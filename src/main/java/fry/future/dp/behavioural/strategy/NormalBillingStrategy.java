package fry.future.dp.behavioural.strategy;

/**
 *
 * @author ranjeet
 */
public class NormalBillingStrategy implements BillingStrategy {

    @Override
    public double getActPrice(double rawPrice) {
        return rawPrice;
    }


}
