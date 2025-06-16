package design.pattern.observer.observable;

import design.pattern.observer.observer.StockObserver;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ProductStock implements ProductObservable{
    private final String product;
    private int quantity = 0;
    private final List<StockObserver> stockObservers = new CopyOnWriteArrayList<>();

    public ProductStock(String product){
        this.product = product;
    }

    @Override
    public void registerObserver(StockObserver stockObserver) { stockObservers.add(stockObserver); }
    @Override
    public void removeObserver(StockObserver stockObserver) { stockObservers.remove(stockObserver); }
    @Override
    public void notifyObservers() {
        for (StockObserver stockObserver : stockObservers) {
            stockObserver.update(product ,  quantity );
        }
    }

    public synchronized void setQuantity( int newQuantity){
        boolean wasOutOfStock = (quantity <= 0); // Checks whether the product was out of stock, which is set to true
        this.quantity = newQuantity;
        if( wasOutOfStock && newQuantity > 0) {
            notifyObservers();
        }
    }

    public int getQuantity(){ return quantity; }
    public String getProduct(){ return product; }
}
