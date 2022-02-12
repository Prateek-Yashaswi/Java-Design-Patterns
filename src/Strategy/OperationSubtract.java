package Strategy;

public class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int n1, int n2) {
        return Math.abs(n1-n2);
    }
}
