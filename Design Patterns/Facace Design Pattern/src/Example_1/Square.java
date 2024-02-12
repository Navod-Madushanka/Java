package Example_1;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw: Square");
    }

    @Override
    public void paint() {
        System.out.println("Paint: Square");
    }
}
