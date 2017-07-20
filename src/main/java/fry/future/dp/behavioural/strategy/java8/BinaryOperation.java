package fry.future.dp.behavioural.strategy.java8;

import java.util.function.BinaryOperator;

/**
 *
 * @author ranjeet
 */
public class BinaryOperation {

    private BinaryOperator<Integer> strategy;

    public BinaryOperation(BinaryOperator<Integer> strategy) {
        this.strategy = strategy;
    }

    public int execute(int a, int b) {
        return strategy.apply(a, b);
    }

    public void setStrategy(BinaryOperator<Integer> strategy) {
        this.strategy = strategy;
    }

}
