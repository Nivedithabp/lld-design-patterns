package design.pattern.decorder.toppings;

import design.pattern.decorder.base.Pizza;

public class Cheese extends ToppingDecorator  implements Pizza {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    private int countCheeseLayers() {
        int count = 0;
        Pizza current = decoratedPizza;
        while (current instanceof ToppingDecorator) {
            if (current instanceof Cheese) count++;
            current = ((ToppingDecorator) current).decoratedPizza;
        }
        return count;
    }

    @Override
    public String getDescription() {
        int cheeseCount = countCheeseLayers();
        if (cheeseCount >= 1) {
            return decoratedPizza.getDescription() + ", Double Cheese has 10% discount";
        }
        return decoratedPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        double cost = decoratedPizza.getCost() + 1.25;
        int cheeseCount = countCheeseLayers();
        if (cheeseCount >= 1) {
            cost -= 0.50;
        }
        return cost;
    }
}
