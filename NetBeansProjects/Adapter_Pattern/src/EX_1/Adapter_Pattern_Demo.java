/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX_1;

/**
 *
 * @author Navod Madusanka
 */
interface MediaPlayer{
    public void play(String fileType, String fileName);
}

interface AdvancedMediaPlayer{
    public void playMp4(String fileName);
    public void playMKV(String filename);
}

class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playMp4(String fileName) {
        System.out.println("Mp4 Playing : File Name : "+fileName);
    }

    @Override
    public void playMKV(String fileName) {
//        Do Nothing
    }
    
}

class MKVPlayer implements AdvancedMediaPlayer{

    @Override
    public void playMp4(String fileName) {
//        DO Nothing
    }

    @Override
    public void playMKV(String fileName) {
        System.out.println("MKV Playing : File Name : "+fileName);
    }
    
}

class MediaAdapter implements MediaPlayer{
    
    AdvancedMediaPlayer advancedMediaPlayer;
    
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }else if (audioType.equalsIgnoreCase("mkv")) {
            advancedMediaPlayer = new MKVPlayer();
        }
    }

    @Override
    public void play(String fileType, String fileName) {
        if(fileType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }else if(fileType.equalsIgnoreCase("mkv")){
            advancedMediaPlayer.playMKV(fileName);
        }
    }
    
}

class AudioPlayer implements MediaPlayer{
    
    MediaAdapter mediaAdapter;

    @Override
    public void play(String fileType, String fileName) {
        if(fileType.equalsIgnoreCase("mp3")){
            System.out.println("MP3 Playing : File Name : "+fileName);
        }else if(fileType.equalsIgnoreCase("mp4")||fileType.equalsIgnoreCase("mkv")){
            mediaAdapter = new MediaAdapter(fileType);
            mediaAdapter.play(fileType, fileName);
        }else{
            System.out.println("Invalid Media Type : File Type = "+fileType);
        }
    }
    
}

public class Adapter_Pattern_Demo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Shape of you");
        audioPlayer.play("mp4", "Shape of you");
        audioPlayer.play("mkv", "Shape of you");
        audioPlayer.play("avi", "Shape of you");
    }
}
