package design.pattern.decorder.pizzatoppings;

public abstract class ToppingDecorator implements Pizza {
    protected Pizza decoratedPizza;

    public ToppingDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }
}
