package design.pattern.observer.observer;

public class EmailNotifier implements StockObserver {
   private final String customerEmail;
   public EmailNotifier(String customerEmail) {
       this.customerEmail = customerEmail;
   }

   @Override
    public void update(String product , int quantity) {
       String message = "Hi " + customerEmail +"! Your item " + product + " is back in stock! (" + quantity + " available)";
       System.out.println(message);
       //call email service here
   }
}
