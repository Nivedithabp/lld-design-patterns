package design.pattern.observer.observer;

public interface StockObserver {
    /**
     * Called when the observed Product's stock status changes.
     * @param product  the product identifier.
     * @param quantity current quantity (>0 means back to stock).
     */
    void update(String product , int quantity);
}
