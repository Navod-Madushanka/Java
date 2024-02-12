package com.Adapter_Pattern.MediaPlayer_Problem;

public class Mp4Player implements Advanced_MediaPlayer{
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file: "+ fileName);
    }
}
