package p1;

class A{
    public A() throws Exception{

    }
}

class B extends A {
    public B(){

    }
}

public class Test {
    public static void main(String[] args) throws InterruptedException {
        B b = new B();
    }
}
