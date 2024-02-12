package Example_1;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw: Triangle");
    }

    @Override
    public void paint() {
        System.out.println("Paint: Triangle");
    }
}
