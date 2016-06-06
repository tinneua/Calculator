package calculators;

import operations.Arguments;
import operations.BinaryOperation;
import operations.CalculatorOperations;
import operations.Operation;

/**
 * Created by lugovskoy.r on 6/6/16.
 */
public class LongCalcImpl extends AbstractCalculator<Long> {
    @Override
    protected void addToStack(String string) {
        calculatedStack.push(Long.valueOf(string));
    }

    @Override
    protected Long executeOperation(String string) {
        Operation operation = CalculatorOperations.getOperation(string);
        Arguments<Long> arguments = getArguments(operation);
        return operation.getResult(arguments.getFirstArg(), arguments.getSecondArg());
    }

    @Override
    protected Arguments<Long> getArguments(Operation operation) {
        Arguments<Long> arguments = new Arguments<>();
        if (operation instanceof BinaryOperation) {
            arguments.setSecondArg(calculatedStack.pop());
        }
        arguments.setFirstArg(calculatedStack.pop());
        return arguments;
    }
}
