package design.pattern.decorder.toppings;

import design.pattern.decorder.base.Pizza;

public class Jalapeno  extends ToppingDecorator implements Pizza {
    public Jalapeno(Pizza pizza) { super(pizza); }

    public String getDescription() {
        return basePizza.getDescription() + ", Jalapeno";
    }

    public double getCost() {
        return basePizza.getCost() + 0.75;
    }
}
