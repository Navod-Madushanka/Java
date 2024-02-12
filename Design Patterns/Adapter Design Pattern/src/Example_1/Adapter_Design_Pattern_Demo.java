package Example_1;

public class Adapter_Design_Pattern_Demo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mkv","Shep of you");
        audioPlayer.play("mp4", "Gateway Girl");
        audioPlayer.play("mp3", "When I see you again");
        audioPlayer.play("fwce","Midnight Rain");
    }
}
