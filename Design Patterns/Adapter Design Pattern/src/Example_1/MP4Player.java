package Example_1;

public class MP4Player implements AdvancedMediaPlayer{
    @Override
    public void playMP4(String fileName) {
        System.out.println("MP4 is playing: The file name is: "+fileName);
    }

    @Override
    public void playMKV(String fileName) {
//        Do Nothing
    }
}
