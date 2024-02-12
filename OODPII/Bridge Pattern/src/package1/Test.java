package package1;
abstract class Shape{
    private Color color;

    public Color getColor() {
        return color;
    }
    public Shape(Color color){
        this.color = color;
    }
    public abstract void draw();
}
interface Color{
    public abstract void fill();
}
class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Circle");
        getColor().fill();
    }
}
class Rectangle extends Shape{
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
        getColor().fill();
    }
}
class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Red");
    }
}

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(new Red());
        circle.draw();
    }
}
