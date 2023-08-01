package org.ankitcode99.decoratorPattern.decorator;

import org.ankitcode99.decoratorPattern.BasePizza;

public class Mushroom extends ToppingsDecorator{
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
