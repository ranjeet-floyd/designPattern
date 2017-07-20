package fry.future.dp.behavioural.strategy.java8;

import java.util.function.BinaryOperator;

/**
 *
 * @author ranjeet
 */
public class OperationUtils {

    static final BinaryOperator<Integer> ADD = (Integer a, Integer b) -> {
        System.out.println("Called add operation on " + a + " and " + b);
        return a + b;
    };

    static final BinaryOperator<Integer> SUBTRACT = (a, b) -> {
        System.out.println("Called subtract operation on " + a + " and " + b);
        return a - b;
    };

    static final BinaryOperator<Integer> MULTIPLY = (a, b) -> {
        System.out.println("Called multiply operation on " + a + " and " + b);
        return a * b;
    };

}
