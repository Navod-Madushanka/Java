package Example_2;

public class Tea extends CaffeineBeverages{
    @Override
    void brew() {
        System.out.println("Sink tea bag");
    }

    @Override
    void addCondiments() {
        System.out.println("Add lemon and sager");
    }
}
