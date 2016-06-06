package operations;


public abstract class UnaryOperation extends Operation {
    public UnaryOperation(int precedence, int association) {
        super(precedence, association);
    }
}
