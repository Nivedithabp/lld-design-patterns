package design.pattern.decorder.base;

public class Margherita implements Pizza {
    @Override
    public String getDescription() {
        return "Margherita - A classic pizza with tomato sauce and mozzarella";
    }
    @Override
    public double getCost() {
        return 6.00;
    }
}
