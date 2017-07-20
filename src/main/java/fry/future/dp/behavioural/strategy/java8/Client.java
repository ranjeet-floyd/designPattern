package fry.future.dp.behavioural.strategy.java8;

/**
 * User code
 *
 * @author ranjeet
 */
public class Client {

    public static void main(String[] args) {

        BinaryOperation operation = new BinaryOperation(OperationUtils.ADD);
        System.out.println(operation.execute(1, 3));
        operation.setStrategy(OperationUtils.SUBTRACT);
        System.out.println(operation.execute(1, 3));
        operation.setStrategy(OperationUtils.MULTIPLY);
        System.out.println(operation.execute(1, 3));
    }
}
