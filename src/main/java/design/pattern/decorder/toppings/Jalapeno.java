package design.pattern.decorder.toppings;

import design.pattern.decorder.base.Pizza;

public class Jalapeno  extends ToppingDecorator {
    public Jalapeno(Pizza pizza) { super(pizza); }

    public String getDescription() {
        return decoratedPizza.getDescription() + ", Jalapeno";
    }

    public double getCost() {
        return decoratedPizza.getCost() + 0.75;
    }
}
