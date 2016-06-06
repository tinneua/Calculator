package operations;

public class Arguments<T> {
    private T firstArg;
    private T secondArg;

    public T getFirstArg() {
        return firstArg;
    }

    public void setFirstArg(T firstArg) {
        this.firstArg = firstArg;
    }

    public T getSecondArg() {
        return secondArg;
    }

    public void setSecondArg(T secondArg) {
        this.secondArg = secondArg;
    }
}
