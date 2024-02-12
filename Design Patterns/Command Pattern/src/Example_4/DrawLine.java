package Example_4;

public class DrawLine implements Command{
    private Draw draw;
    public DrawLine(Draw draw){
        this.draw = draw;
    }

    @Override
    public void executeCommand() {
        draw.drawLine();
    }
}
