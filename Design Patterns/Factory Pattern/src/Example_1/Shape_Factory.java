package Example_1;

public class Shape_Factory {
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
