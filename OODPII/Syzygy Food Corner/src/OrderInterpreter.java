interface Expression{
    void interpret(Context context);
}
class CheeseExpression implements Expression{
    @Override
    public void interpret(Context context) {
        context.setOutput(context.getOutput()+" ExtraCheese");
    }
}
class Context{
    private String output = "";

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
public class OrderInterpreter {
}
