package Example_1;

class A{
    private static A a;
    public static synchronized A getInstance(){
        if(a==null){
            a = new A();
        }
        return a;
    }
}

public class Singleton_Pattern {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        a = new A();
        System.out.println(a);
    }
}
