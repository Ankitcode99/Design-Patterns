package org.ankitcode99.decoratorPattern.decorator;

import org.example.decoratorPattern.BasePizza;

public class ExtraCheese extends ToppingsDecorator{
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 5;
    }
}
