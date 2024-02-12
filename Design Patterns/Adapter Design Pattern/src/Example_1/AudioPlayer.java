package Example_1;

public class AudioPlayer implements MediaPlayer{
    private MediaPlayer mediaPlayer;
    @Override
    public void play(String fileType, String fileName) {
        if(fileType.equalsIgnoreCase("mp3")){
            System.out.println("MP3 is playing: The file name is: "+fileName);
        }else if(fileType.equalsIgnoreCase("mp4")||fileType.equalsIgnoreCase("mkv")){
            mediaPlayer = new MediaAdapter(fileType);
        }else{
            System.out.println("File type is not compatible: The file type is: "+fileType);
        }
    }
}
