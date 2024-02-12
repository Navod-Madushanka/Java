package Example_1;

public class Main {
    public static void main(String[] args) {
        Shape_Factory shapeFactory = new Shape_Factory();
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();
        Shape shape1 = shapeFactory.getShape("triangle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();
    }
}
