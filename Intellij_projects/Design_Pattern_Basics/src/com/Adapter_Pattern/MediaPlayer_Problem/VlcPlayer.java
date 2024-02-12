package com.Adapter_Pattern.MediaPlayer_Problem;

public class VlcPlayer implements Advanced_MediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Play VLC file: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
