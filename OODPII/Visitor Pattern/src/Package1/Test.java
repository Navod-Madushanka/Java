package Package1;
interface Visitor{
    public int m(int x, int y);
}
class X{
    private final Visitor visitor;

    public X(Visitor visitor) {
        this.visitor = visitor;
    }

    public int m(int x, int y){
        return visitor.m(x, y);
    }
}
class A implements Visitor{
    @Override
    public int m(int x, int y) {
        return x+y;
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        X x = new X(a);
        System.out.println(x.m(10, 20));
    }
}
