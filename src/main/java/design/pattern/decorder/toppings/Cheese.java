package design.pattern.decorder.toppings;

import design.pattern.decorder.base.Pizza;

public class Cheese extends ToppingDecorator  implements Pizza {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    private int countCheeseLayers() {
        int count = 0;
        Pizza current = basePizza;
        while (current instanceof ToppingDecorator) {
            if (current instanceof Cheese) count++;
            current = ((ToppingDecorator) current).basePizza;
        }
        return count;
    }

    @Override
    public String getDescription() {
        int cheeseCount = countCheeseLayers();
        if (cheeseCount >= 1) {
            return basePizza.getDescription() + ", Double Cheese has 10% discount";
        }
        return basePizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        double cost = basePizza.getCost() + 1.25;
        int cheeseCount = countCheeseLayers();
        if (cheeseCount >= 1) {
            cost -= 0.50;
        }
        return cost;
    }
}
