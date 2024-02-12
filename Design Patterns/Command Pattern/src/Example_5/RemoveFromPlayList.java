package Example_5;

public class RemoveFromPlayList implements Command{
    private Song song;
    public RemoveFromPlayList(Song song){
        this.song = song;
    }
    @Override
    public void executeCommand() {
        song.removeFormPlaylist();
    }
}
