package Example_2;

public class MultiplyOperation implements Strategy{
    @Override
    public int doOperation(int num_1, int num_2) {
        return num_1 * num_2;
    }
}
