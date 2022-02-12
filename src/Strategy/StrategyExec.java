package Strategy;

public class StrategyExec {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("Add: "+ context.executeStrategy(10,5));

        Context context1 = new Context(new OperationSubtract());
        System.out.println("Subtract: "+ context1.executeStrategy(10,5));

        Context context2 = new Context(new OperationMultiply());
        System.out.println("Multiply: "+ context2.executeStrategy(10,5));
    }
}
