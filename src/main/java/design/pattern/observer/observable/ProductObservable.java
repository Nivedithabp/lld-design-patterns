package design.pattern.observer.observable;

import design.pattern.observer.observer.StockObserver;

public interface ProductObservable {
    void registerObserver(StockObserver stockObserver);
    void removeObserver(StockObserver stockObserver);
    void notifyObservers();
}
