package Example_5;

public class Song {
    private String songName;
    public Song(String songName){
        this.songName = songName;
    }
    public void addToPlaylist(){
        System.out.println("The "+songName+" song is added to the playlist");
    }
    public void removeFormPlaylist(){
        System.out.println("The "+songName+" is removed from the playlist");
    }
    public void undoAction(){
        System.out.println("The previous action removed");
    }
}
