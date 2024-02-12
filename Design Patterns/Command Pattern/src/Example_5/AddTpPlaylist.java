package Example_5;

public class AddTpPlaylist implements Command{
    private Song song;
    public AddTpPlaylist(Song song){
        this.song = song;
    }

    @Override
    public void executeCommand() {
        song.addToPlaylist();
    }
}
