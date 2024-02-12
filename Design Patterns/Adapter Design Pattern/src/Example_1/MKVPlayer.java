package Example_1;

public class MKVPlayer implements AdvancedMediaPlayer{
    @Override
    public void playMP4(String fileName) {
//        Do Nothing
    }

    @Override
    public void playMKV(String fileName) {
        System.out.println("MKV is playing: The file name is: "+fileName);
    }
}
