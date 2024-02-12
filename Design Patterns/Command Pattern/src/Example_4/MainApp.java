package Example_4;

public class MainApp {
    public static void main(String[] args) {
        Draw draw = new Draw();
        Invoker invoker = new Invoker();

        DrawLine drawLine = new DrawLine(draw);
        invoker.addCommands(drawLine);

        DrawCircle drawCircle = new DrawCircle(draw);
        invoker.addCommands(drawCircle);

        DrawTriangle drawTriangle = new DrawTriangle(draw);
        invoker.addCommands(drawTriangle);

        DrawRectangle drawRectangle = new DrawRectangle(draw);
        invoker.addCommands(drawRectangle);

        invoker.undoCommand();

        invoker.executeCommands();
    }
}
