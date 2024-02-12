package Package1;

class A extends Component{
    public void m1(){
        System.out.println("A m1");
    }
    public void n1(){
        System.out.println("A n1");
        mediator.callCm3();
    }
    public void p1(){
        System.out.println("A p1");
    }
}
class B extends Component{
    public void m2(){
        System.out.println("B m2");
        mediator.callCm3();
    }
}
class C extends Component{
    public void m3(){
        System.out.println("C m3");
    }
    public void n3(){
        System.out.println("A n1");
        mediator.callAp1();
    }
}
abstract class Component{
    protected Mediator mediator;
    public final void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
class Mediator{
    private final A a;
    private final B b;
    private final C c;

    public Mediator(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void callAm1(){
        a.m1();
    }
    public void callAn1(){
        a.n1();
    }
    public void callAp1(){
        a.p1();
    }
    public void callBm2(){
        b.m2();
    }
    public void callCm3(){
        c.m3();
    }
    public void callCn3(){
        c.n3();
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        Mediator mediator = new Mediator(a, b, c);

       a.setMediator(mediator);
       b.setMediator(mediator);
       c.setMediator(mediator);

        mediator.callAm1();
        mediator.callBm2();
        mediator.callAn1();
        mediator.callCn3();
    }
}
