package design.pattern.observer;

import design.pattern.observer.observable.ProductStock;
import design.pattern.observer.observer.EmailNotifier;
import design.pattern.observer.observer.SmsNotifier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NotifyMeApp {
    public static void main(String[] args) {
        ProductStock iphone = new ProductStock("iphone");
        System.out.println("Current Quantity " + iphone.getQuantity());

        iphone.registerObserver(new EmailNotifier("abc@gmail.com"));
        iphone.registerObserver(new SmsNotifier("+19876543210"));
        iphone.setQuantity(2);
    }
}