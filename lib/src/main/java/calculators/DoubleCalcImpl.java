package calculators;

import operations.Arguments;
import operations.BinaryOperation;
import operations.CalculatorOperations;
import operations.Operation;


public class DoubleCalcImpl extends AbstractCalculator<Double> {
    @Override
    protected void addToStack(String string) {
        calculatedStack.push(Double.valueOf(string));
    }

    @Override
    protected Double executeOperation(String string) {
        Operation operation = CalculatorOperations.getOperation(string);
        Arguments<Double> arguments = getArguments(operation);
        return operation.getResult(arguments.getFirstArg(), arguments.getSecondArg());
    }

    @Override
    protected Arguments<Double> getArguments(Operation operation) {
        Arguments<Double> arguments = new Arguments<>();
        if (operation instanceof BinaryOperation) {
            arguments.setSecondArg(calculatedStack.pop());
        }
        arguments.setFirstArg(calculatedStack.pop());
        return arguments;
    }
}
