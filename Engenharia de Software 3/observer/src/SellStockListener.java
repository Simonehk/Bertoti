public class SellStockListener implements Observer {

    @Override
    public void update(float price) {
        if (price > 70)
        System.out.println("Overbought");
    }
    
}
