package operations;
import java.util.HashMap;
import java.util.Map;


public class CalculatorOperations {
    static final int LEFT_ASSOC = 0;
    static final int RIGHT_ASSOC = 1;
    private static Map<String, Operation> OPERATORS;

    public CalculatorOperations() {
        initializeOperations();

    }

    private void initializeOperations() {
        OPERATORS = new HashMap<>();
        addOperation("+", new Addition(1, LEFT_ASSOC));
        addOperation("-", new Subtraction(1, LEFT_ASSOC));
        addOperation("*", new Multiply(2, LEFT_ASSOC));
        addOperation("/", new Division(2, LEFT_ASSOC));
    }

    private void addOperation(String name, Operation operation) {
        OPERATORS.put(name, operation);
    }

    public static Operation getOperation(String token) {
        return OPERATORS.get(token);
    }


    public static boolean isOperator(String token) {
        return OPERATORS.containsKey(token);
    }

    static boolean isAssociative(String token, int type) {
        if (!isOperator(token)) {
            throw new IllegalArgumentException("Invalid token: " + token);
        }
        return OPERATORS.get(token).getAssociation() == type;
    }

    static int comparePrecedence(String token1, String token2) {
        if (!isOperator(token1) || !isOperator(token2)) {
            throw new IllegalArgumentException("Invalid tokens: " + token1
                    + " " + token2);
        }
        return OPERATORS.get(token1).getPrecedence() - OPERATORS.get(token2).getPrecedence();
    }
}
