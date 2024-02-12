package Example_1;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw: Rectangle");
    }

    @Override
    public void paint() {
        System.out.println("Paint: Rectangle");
    }
}
