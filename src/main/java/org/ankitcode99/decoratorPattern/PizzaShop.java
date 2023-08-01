package org.ankitcode99.decoratorPattern;

import org.ankitcode99.decoratorPattern.decorator.ExtraCheese;
import org.ankitcode99.decoratorPattern.decorator.Mushroom;
import org.ankitcode99.decoratorPattern.decorator.Onion;

public class PizzaShop {
    public static void main(String[] args) {

        // Make a FARMHOUSE PIZZA with EXTRA CHEESE & MUSHROOM
        BasePizza pizza1 = new Mushroom(new ExtraCheese(new Farmhouse()));

        // Make a Veggie Delight Pizza with extra onion
        BasePizza pizza2 = new Onion(new VeggieDelight());

        System.out.println("Cost of Pizza1 - "+pizza1.cost());
        System.out.println("Cost of Pizza2 - "+pizza2.cost());
    }
}
