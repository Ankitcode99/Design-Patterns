package org.ankitcode99.factoryPattern;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing "+this.getClass().getSimpleName());
    }
}
