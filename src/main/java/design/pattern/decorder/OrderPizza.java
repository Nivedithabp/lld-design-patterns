package design.pattern.decorder;

import design.pattern.decorder.base.Farmhouse;
import design.pattern.decorder.base.Margherita;
import design.pattern.decorder.base.Pizza;
import design.pattern.decorder.toppings.Cheese;
import design.pattern.decorder.toppings.Jalapeno;

public class OrderPizza {
    public static void main(String[] args) {
        Pizza myPizza = new Margherita();
        myPizza = new Cheese(myPizza);
        myPizza = new Jalapeno(myPizza);
        myPizza = new Cheese(myPizza); // extra cheese!

        System.out.println(myPizza.getDescription());
        System.out.println("Total: $" + myPizza.getCost());

        Pizza order2 = new Farmhouse();
        order2 = new Cheese(order2);
        order2 = new Jalapeno(order2);
        System.out.println(order2.getDescription());
        System.out.println("Total: $" + order2.getCost());
    }
}
