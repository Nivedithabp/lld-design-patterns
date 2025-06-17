package design.pattern.decorder.carfeatures;

public class SportsPackage extends CarDecorator{
    private boolean comboApplied;
    public SportsPackage(Car car) {
        super(car);
        //check if perimiumInterior exists
        if( car.getFeatures().contains("Permium Interior")){
            comboApplied = true;
        }
    }

    @Override
    public String getFeatures() {
        if(comboApplied){
            return car.getFeatures() + ", Sports Package (combo discount applied)";
        }
        return car.getFeatures() + ", Sports Package";
    }

    @Override
    public double getPrice() {
        double price = car.getPrice() + 2500;
        if(comboApplied){
            price -= 500;
        }
        return price;
    }
}
