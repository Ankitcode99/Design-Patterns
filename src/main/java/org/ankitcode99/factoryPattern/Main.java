package org.ankitcode99.factoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactoryImplementation();

        Shape circle = shapeFactory.createShape("Circle");
        Shape rectangle = shapeFactory.createShape("Rectangle");

        circle.draw();
        rectangle.draw();
    }
}
