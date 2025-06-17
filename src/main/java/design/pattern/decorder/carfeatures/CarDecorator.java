package design.pattern.decorder.carfeatures;

public abstract class CarDecorator implements Car {
    protected  Car car;
    public CarDecorator(Car car) {
        this.car = car;
    }
}
