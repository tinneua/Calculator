package calculators;

import operations.Arguments;
import operations.BinaryOperation;
import operations.CalculatorOperations;
import operations.Operation;

public class FloatCalcImpl extends AbstractCalculator<Float> {
    @Override
    protected void addToStack(String string) {
        calculatedStack.push(Float.valueOf(string));
    }

    @Override
    protected Float executeOperation(String string) {
        Operation operation = CalculatorOperations.getOperation(string);
        Arguments<Float> arguments = getArguments(operation);
        return operation.getResult(arguments.getFirstArg(), arguments.getSecondArg());
    }

    @Override
    protected Arguments<Float> getArguments(Operation operation) {
        Arguments<Float> arguments = new Arguments<>();
        if (operation instanceof BinaryOperation) {
            arguments.setSecondArg(calculatedStack.pop());
        }
        arguments.setFirstArg(calculatedStack.pop());
        return arguments;
    }
}
