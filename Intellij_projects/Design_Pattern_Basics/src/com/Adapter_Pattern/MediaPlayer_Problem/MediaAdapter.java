package com.Adapter_Pattern.MediaPlayer_Problem;

public class MediaAdapter implements MediaPlayer{
    Advanced_MediaPlayer advanced_mediaPlayer;
    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("vlc")){
            advanced_mediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanced_mediaPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")){
            advanced_mediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanced_mediaPlayer.playMp4(fileName);
        }
    }
}
