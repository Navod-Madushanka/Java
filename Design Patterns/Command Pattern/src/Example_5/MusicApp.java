package Example_5;

public class MusicApp {
    public static void main(String[] args) {
        Song shepOfYou = new Song("Shep of You");
        Broker broker = new Broker();
        AddTpPlaylist addTpPlaylist = new AddTpPlaylist(shepOfYou);
        broker.addToCommandList(addTpPlaylist);
        broker.executeCommands();
    }
}
