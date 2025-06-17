package design.pattern.decorder;

import design.pattern.decorder.carfeatures.BasicCar;
import design.pattern.decorder.carfeatures.Car;
import design.pattern.decorder.carfeatures.PermiumInterior;
import design.pattern.decorder.carfeatures.SportsPackage;
import design.pattern.decorder.pizzatoppings.Farmhouse;
import design.pattern.decorder.pizzatoppings.Margherita;
import design.pattern.decorder.pizzatoppings.Pizza;
import design.pattern.decorder.pizzatoppings.Cheese;
import design.pattern.decorder.pizzatoppings.Jalapeno;

public class Biiling {
    public static void main(String[] args) {
// Pizza Topping example
//        Pizza myPizza = new Margherita();
//        myPizza = new Cheese(myPizza);
//        myPizza = new Jalapeno(myPizza);
//        myPizza = new Cheese(myPizza); // extra cheese!
//
//        System.out.println(myPizza.getDescription());
//        System.out.println("Total: $" + myPizza.getCost());
//
//        Pizza order2 = new Farmhouse();
//        order2 = new Cheese(order2);
//        order2 = new Jalapeno(order2);
//        System.out.println(order2.getDescription());
//        System.out.println("Total: $" + order2.getCost());
        Car myCar = new BasicCar();
        myCar = new PermiumInterior(myCar);
        myCar = new SportsPackage(myCar);  // Combo logic inside
        System.out.println("Your Car: " + myCar.getFeatures());
        System.out.println("Total Price: $" + myCar.getPrice());


    }
}
