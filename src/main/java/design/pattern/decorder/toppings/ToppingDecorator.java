package design.pattern.decorder.toppings;

import design.pattern.decorder.base.Pizza;

public abstract class ToppingDecorator {
    protected Pizza basePizza;
    public ToppingDecorator(Pizza pizza) {
        this.basePizza = pizza;
    }
}
