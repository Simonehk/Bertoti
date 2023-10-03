public class BuyStockListener  implements Observer{

    @Override
    public void update(float price) {
        if (price < 30)
        System.out.println("Oversold ");
    }
    
}
