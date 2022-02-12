package Command;

public class SellStock implements Order{
    private Stock abcOrder;

    public SellStock(Stock absOrder) {
        this.abcOrder = absOrder;
    }

    @Override
    public void execute() {
        abcOrder.sell();
    }
}
