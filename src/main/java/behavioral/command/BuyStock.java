package behavioral.command;

public class BuyStock implements Order
{
    private Stock abcStock;

    public BuyStock(Stock abcStock)
    {
        this.abcStock = abcStock;
    }

    @Override
    public String execute()
    {
      return abcStock.buy();
    }
}
