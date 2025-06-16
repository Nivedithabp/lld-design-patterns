package design.pattern.decorder.base;

public class Farmhouse  implements Pizza {
    @Override
    public String getDescription() {
        return "Farmhouse - Loaded with onion, capsicum, tomato & mushrooms";
    }

    @Override
    public double getCost() {
        return 8.00;
    }
}
