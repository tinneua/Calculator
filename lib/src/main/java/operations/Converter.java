package operations;


import java.util.*;

public class Converter {

    public static String[] infixToPostfix(String[] inputTokens) {

        ArrayList<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        for (String token : inputTokens) {
            if (CalculatorOperations.isOperator(token)) {
                while (!stack.empty() && CalculatorOperations.isOperator(stack.peek())) {
                    if (hasHigherPriority(stack, token)) {
                        result.add(stack.pop());
                        continue;
                    }
                    break;
                }
                stack.push(token);
            } else if (isOpeningBracket(token)) {
                stack.push(token);
            } else if (isClosingBracket(token)) {
                while (!stack.empty() && !isOpeningBracket(stack.peek())) {
                    result.add(stack.pop());
                }
                stack.pop();
            } else {
                result.add(token);
            }
        }
        while (!stack.empty()) {
            result.add(stack.pop());
        }
        String[] output = new String[result.size()];
        return result.toArray(output);
    }

    private static boolean isClosingBracket(String token) {
        return token.equals(")");
    }

    private static boolean isOpeningBracket(String token) {
        return token.equals("(");
    }

    private static boolean hasHigherPriority(Stack<String> stack, String token) {
        return (CalculatorOperations.isAssociative(token, CalculatorOperations.LEFT_ASSOC) && CalculatorOperations.comparePrecedence(token, stack.peek()) <= 0) ||
                (CalculatorOperations.isAssociative(token, CalculatorOperations.RIGHT_ASSOC)) && CalculatorOperations.comparePrecedence(token, stack.peek()) < 0;
    }
}