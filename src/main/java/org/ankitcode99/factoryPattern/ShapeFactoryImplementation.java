package org.ankitcode99.factoryPattern;

public class ShapeFactoryImplementation implements ShapeFactory {
    @Override
    public Shape createShape(String shape) {
        switch (shape){
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
