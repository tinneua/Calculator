package operations;


import operations.Exceptions.DivisionByZeroException;

class Division extends BinaryOperation{

    Division(int precedence, int association) {
        super(precedence, association);
    }

    @Override
    public int getResult(int firstArgument, int secondArgument) {
        if (secondArgument == 0) throw new DivisionByZeroException();
        return firstArgument / secondArgument;
    }

    @Override
    public long getResult(long firstArgument, long secondArgument) {
        if (secondArgument == 0) throw new DivisionByZeroException();
        return firstArgument / secondArgument;
    }

    @Override
    public double getResult(double firstArgument, double secondArgument) {
        if (secondArgument == 0) throw new DivisionByZeroException();
        return firstArgument / secondArgument;
    }

    @Override
    public float getResult(float firstArgument, float secondArgument) {
        if (secondArgument == 0) throw new DivisionByZeroException();
        return firstArgument / secondArgument;
    }
}
