package design.pattern.decorder.carfeatures;

public class PermiumInterior extends CarDecorator{
    public PermiumInterior(Car car) {
        super(car);
    }

    @Override
    public String getFeatures() {
        return car.getFeatures() + ", Permium Interior";
    }

    @Override
    public double getPrice() {
        return car.getPrice() + 2000;
    }
}
