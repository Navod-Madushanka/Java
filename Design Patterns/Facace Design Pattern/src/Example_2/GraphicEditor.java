package Example_2;

public class GraphicEditor implements Frameworks{
    @Override
    public void encoding() {
        System.out.println("Graphic: encoded");
    }

    @Override
    public void decoding() {
        System.out.println("Graphic: decoded");
    }

    @Override
    public void filtering() {
        System.out.println("Graphic: filtered");
    }

    @Override
    public void cropping() {
        System.out.println("Graphic: cropped");
    }

    @Override
    public void merging() {
        System.out.println("Graphic: merged");
    }
}
