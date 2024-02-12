package Example_2;

public class VideoEditor implements Frameworks{
    @Override
    public void encoding() {
        System.out.println("Video: encoded");
    }

    @Override
    public void decoding() {
        System.out.println("Video: decoded");
    }

    @Override
    public void filtering() {
        System.out.println("Video: filtered");
    }

    @Override
    public void cropping() {
        System.out.println("Video: cropped");
    }

    @Override
    public void merging() {
        System.out.println("Video: merged");
    }
}
