package Package1;

interface Prototype<T>{
    public T clone();
}
class X implements Prototype<X>{
    private int a;
    private int b;

    @Override
    public X clone(){
        X x = new X();
        x.setA(this.a);
        x.setB(this.b);
        return x;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

public class Test {
    public static void main(String[] args) {
        X x1 = new X();
        x1.setA(10);
        x1.setB(20);

        X clone = x1.clone();
    }
}
