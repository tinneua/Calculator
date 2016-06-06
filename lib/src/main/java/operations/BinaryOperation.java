package operations;

public abstract class BinaryOperation extends Operation {
    BinaryOperation(int precedence, int association) {
        super(precedence, association);
    }
}
