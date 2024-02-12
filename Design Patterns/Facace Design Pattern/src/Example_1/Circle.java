package Example_1;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw: Circle");
    }

    @Override
    public void paint() {
        System.out.println("Paint: Circle");
    }
}
