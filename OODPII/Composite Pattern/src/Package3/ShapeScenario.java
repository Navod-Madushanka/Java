package Package3;

import java.util.ArrayList;
import java.util.List;

interface Shape{
    public void draw();
}

class Line implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw Line");
    }
}
class AdvancedShape implements Shape{
    List<Shape> shapeList = new ArrayList<>();
    public void addShape(Shape shape){
        shapeList.add(shape);
    }
    @Override
    public void draw() {
        for(Shape shape: shapeList){
            shape.draw();
        }
    }
}

public class ShapeScenario {
}
