package Example_2;

public class Calculator {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println(context.executeOperation(1,1));
        context = new Context(new SubtractOperation());
        System.out.println(context.executeOperation(5, 3));
        context = new Context(new MultiplyOperation());
        System.out.println(context.executeOperation(3,3));
    }
}
