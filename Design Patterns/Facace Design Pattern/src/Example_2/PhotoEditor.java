package Example_2;

public class PhotoEditor implements Frameworks{
    @Override
    public void encoding() {
        System.out.println("Photo: encoded");
    }

    @Override
    public void decoding() {
        System.out.println("Photo: decoded");
    }

    @Override
    public void filtering() {
        System.out.println("Photo: filtered");
    }

    @Override
    public void cropping() {
        System.out.println("Photo: cropped");
    }

    @Override
    public void merging() {
        System.out.println("Photo: merged");
    }
}
