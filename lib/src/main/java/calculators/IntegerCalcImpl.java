package calculators;


import operations.*;

public class IntegerCalcImpl extends AbstractCalculator<Integer> {

    @Override
    protected void addToStack(String string) {
        calculatedStack.push(Integer.valueOf(string));
    }

    @Override
    protected Integer executeOperation(String string) {
        Operation operation = CalculatorOperations.getOperation(string);
        Arguments<Integer> arguments = getArguments(operation);
        return operation.getResult(arguments.getFirstArg(), arguments.getSecondArg());
    }

    @Override
    protected Arguments<Integer> getArguments(Operation operation) {
        Arguments<Integer> arguments = new Arguments<>();
        if (operation instanceof BinaryOperation) {
            arguments.setSecondArg(calculatedStack.pop());
        }
        arguments.setFirstArg(calculatedStack.pop());
        return arguments;
    }
}
