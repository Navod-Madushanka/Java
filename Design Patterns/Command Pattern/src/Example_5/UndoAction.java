package Example_5;

public class UndoAction implements Command{
    private Song song;
    public UndoAction(Song song){
        this.song = song;
    }
    @Override
    public void executeCommand() {
        song.undoAction();
    }
}
