package Package3;
interface DrawingAPI{
    void drawCircle(double x, double y, double radius);
    void drawSquare(double x, double y, double side);
}
class OpenDLDrawing implements DrawingAPI{
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("Drawing circle in OpenGL at (%.2f, %.2f) with radius %.2f%n", x, y, radius);
    }

    @Override
    public void drawSquare(double x, double y, double side) {
        System.out.printf("Drawing square in SVG at (%.2f, %.2f) with side %.2f%n", x, y, side);
    }
}
class SVGDrawing implements DrawingAPI{
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("Drawing circle in SVG at (%.2f, %.2f) with radius %.2f%n", x, y, radius);
    }

    @Override
    public void drawSquare(double x, double y, double side) {
        System.out.printf("Drawing square in SVG at (%.2f, %.2f) with side %.2f%n", x, y, side);
    }
}
abstract class Shape{
    protected DrawingAPI drawingAPI;
    protected Shape(DrawingAPI drawingAPI){
        this.drawingAPI = drawingAPI;
    }
    public abstract void draw();
}
class Circle extends Shape{
    private double x, y, radius;

    public Circle(DrawingAPI drawingAPI, double x, double y, double radius) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }
}
class Square extends Shape{
    private double x, y, side;

    public Square(DrawingAPI drawingAPI, double x, double y, double side) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.side = side;
    }

    @Override
    public void draw() {
        drawingAPI.drawSquare(x, y, side);
    }
}

public class DrawingExample {
    public static void main(String[] args) {
        OpenDLDrawing openDLDrawing = new OpenDLDrawing();
        SVGDrawing svgDrawing = new SVGDrawing();

        Shape circle = new Circle(openDLDrawing,1,2,3);
        Shape square = new Circle(svgDrawing,4,5,6);

        circle.draw();
        square.draw();
    }
}
