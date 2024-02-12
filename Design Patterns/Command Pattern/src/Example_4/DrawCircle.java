package Example_4;

public class DrawCircle implements Command{
    private Draw draw;
    public DrawCircle(Draw draw){
        this.draw = draw;
    }
    @Override
    public void executeCommand() {
        draw.drawCircle();
    }
}
