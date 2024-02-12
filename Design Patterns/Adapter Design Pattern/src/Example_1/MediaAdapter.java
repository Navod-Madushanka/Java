package Example_1;

public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new MP4Player();
        }else if(audioType.equalsIgnoreCase("mkv")){
            advancedMediaPlayer = new MKVPlayer();
        }
    }
    @Override
    public void play(String fileType, String fileName) {
        if(fileType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMP4(fileName);
        }else if(fileType.equalsIgnoreCase("mkv")){
            advancedMediaPlayer.playMKV(fileName);
        }
    }
}
