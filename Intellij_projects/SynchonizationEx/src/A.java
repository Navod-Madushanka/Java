public class A {
    public static void main(String[] args) {
        A a = new A();
        synchronized (a){
            try {
                a.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
