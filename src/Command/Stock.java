package Command;

public class Stock {
    private String name = "ABC";
    private int qty = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + qty +" ] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + qty +" ] sold");
    }
}
