package behavioral.command;

public class Stock
{
    private String name = "ABC";
    private int quantity = 10;

    public String buy()
    {
        return "Stock [name: " + name + ", quantity: " + quantity + "] bought";
    }

    public String sell()
    {
        return "Stock [name: " + name + ", quantity: " + quantity + "] sold";
    }
}
