package operations;

public abstract class Operation {
    private int precedence;
    private int association;

    Operation(int precedence, int association) {
        this.precedence = precedence;
        this.association = association;
    }

    int getAssociation() {
        return association;
    }

    int getPrecedence() {
        return precedence;
    }

    public abstract int getResult(int firstArgument, int secondArgument);
    public abstract long getResult(long firstArgument, long secondArgument);
    public abstract double getResult(double firstArgument, double secondArgument);
    public abstract float getResult(float firstArgument, float secondArgument);
}
