import calculators.AbstractCalculator;

public class Calculator {
    private static final String REGEX = " ";
    private AbstractCalculator calculator;

    public void setCalculator(AbstractCalculator calculator) {
        this.calculator = calculator;
    }

    String getCalculation(String input) {

        return String.valueOf(doCalculation(input));
    }

    private Object doCalculation(String input) {
        return calculator.executeCalculation(stringToArray(input));
    }

    private String[] stringToArray(String input) {
        return input.split(REGEX);
    }
}
