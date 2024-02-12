package Example_1;

public class ShapeCreator {
    private final Shape square;
    private final Shape triangle;
    private final Shape rectangle;
    private final Shape circle;

    public ShapeCreator() {
        square = new Square();
        triangle = new Triangle();
        rectangle = new Rectangle();
        circle = new Circle();
    }

    public void drawSquare(){
        square.draw();
    }
    public void drawTriangle(){
        triangle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void paintSquare(){
        square.paint();
    }
    public void paintTriangle(){
        triangle.paint();
    }
    public void paintRectangle(){
        rectangle.paint();
    }
    public void paintCircle(){
        circle.paint();
    }

}
