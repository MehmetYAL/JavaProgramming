package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {
    public static void main(String[] args) {
        //Pizza pizzaOrder1=new Pizza('S',100,100);
        ArrayList<Pizza> pizzas=new ArrayList<>();

        for (int i = 0; i < 100; i++) {
    Pizza smallPizza=new Pizza('S',2,3);
    Pizza mediumPizza=new Pizza('M',3,4);
    Pizza largePizza=new Pizza('L',4,5);

    pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));
        }
        System.out.println("total number of pizza: "+pizzas.size());

        double totalPrice=0;
        for (Pizza eachPizza : pizzas) {
            totalPrice+=eachPizza.calcCost();

        }
        System.out.println("total price $= "+totalPrice);
    }
}
