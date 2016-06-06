package operations;


class Addition extends BinaryOperation {


    Addition(int precedence, int association) {
        super(precedence, association);
    }

    @Override
    public int getResult(int firstArgument, int secondArgument) {
        return firstArgument + secondArgument;
    }
    @Override
    public long getResult(long firstArgument, long secondArgument) {
        return firstArgument + secondArgument;
    }
    @Override
    public double getResult(double firstArgument, double secondArgument) {
        return firstArgument + secondArgument;
    }
    @Override
    public float getResult(float firstArgument, float secondArgument) {
        return firstArgument + secondArgument;
    }


}
