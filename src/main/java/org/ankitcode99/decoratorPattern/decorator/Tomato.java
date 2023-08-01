package org.ankitcode99.decoratorPattern.decorator;

import org.ankitcode99.decoratorPattern.BasePizza;

public class Tomato extends ToppingsDecorator{
    BasePizza basePizza;

    public Tomato(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
