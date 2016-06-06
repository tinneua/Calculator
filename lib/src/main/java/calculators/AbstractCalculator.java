package calculators;

import operations.Arguments;
import operations.CalculatorOperations;
import operations.Converter;
import operations.Operation;

import java.util.ArrayDeque;
import java.util.Deque;

public abstract class AbstractCalculator<T> {
    protected CalculatorOperations operations;
    Deque<T> calculatedStack;


    public AbstractCalculator() {
        this.operations = new CalculatorOperations();
        this.calculatedStack = new ArrayDeque<>();
    }

    private String[] convertInput(String[] input) {
        new Converter();
        return Converter.infixToPostfix(input);
    }

    public T executeCalculation(String[] input) {
        //add validator

        return execute(convertInput(input));
    }

    private T execute(String[] strings) {
        for (String string : strings) {
            if(CalculatorOperations.isOperator(string)) {
                calculatedStack.push(executeOperation(string));
            } else addToStack(string);
        }
        return calculatedStack.pop();
    }

    protected abstract void addToStack(String string);

    protected abstract T executeOperation(String string);

    protected abstract Arguments<T> getArguments(Operation operation);

}
