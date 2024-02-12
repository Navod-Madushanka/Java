package Example_4;

public class DrawTriangle implements Command{
    private Draw draw;
    public DrawTriangle(Draw draw){
        this.draw = draw;
    }
    @Override
    public void executeCommand() {
        draw.drawTriangle();
    }
}
