package design.pattern.decorder.pizzatoppings;

public class Jalapeno  extends ToppingDecorator {
    public Jalapeno(Pizza pizza) { super(pizza); }

    public String getDescription() {
        return decoratedPizza.getDescription() + ", Jalapeno";
    }

    public double getCost() {
        return decoratedPizza.getCost() + 0.75;
    }
}
