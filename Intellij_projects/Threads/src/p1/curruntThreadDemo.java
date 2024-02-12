package p1;

public class curruntThreadDemo {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
