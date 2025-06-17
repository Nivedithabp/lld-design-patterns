package design.pattern.decorder.carfeatures;

public class Sunroof extends CarDecorator {
    public Sunroof(Car car) {
        super(car);
    }

    @Override
    public String getFeatures() {
        return car.getFeatures() + "Sunroof";
    }

    @Override
    public double getPrice() {
        return car.getPrice() + 1200;
    }
}
