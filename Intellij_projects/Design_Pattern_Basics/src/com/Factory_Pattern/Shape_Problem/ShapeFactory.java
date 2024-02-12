package com.Factory_Pattern.Shape_Problem;

public class ShapeFactory {
    //use getShape method to get object of type Shape
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
