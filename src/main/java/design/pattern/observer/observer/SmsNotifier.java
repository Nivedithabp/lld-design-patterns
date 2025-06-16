package design.pattern.observer.observer;

public class SmsNotifier implements StockObserver {
    private final String customerNumber;
    public SmsNotifier(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public void update(String product , int quantity) {
        String message =  "Hi " + customerNumber +"! Your item " + product + " is back in stock! (" + quantity + " available)";
        System.out.println(message);
        //call email service here
    }
}
