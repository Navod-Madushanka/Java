package Example_4;

public class DrawRectangle implements Command{
    private Draw draw;
    public DrawRectangle(Draw draw){
        this.draw = draw;
    }
    @Override
    public void executeCommand() {
        draw.drawRectangle();
    }
}
