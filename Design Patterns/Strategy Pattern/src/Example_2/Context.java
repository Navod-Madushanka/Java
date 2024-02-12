package Example_2;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeOperation(int num_1, int num_2){
        return strategy.doOperation(num_1, num_2);
    }
}
