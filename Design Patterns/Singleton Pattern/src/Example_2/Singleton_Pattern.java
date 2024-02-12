package Example_2;

class A{
    private static A a;
    public static int x = 10;
    private A(){}
    public static synchronized A getInstance(){
        if(a==null){
            a = new A();
        }
        return a;
    }
}

public class Singleton_Pattern {
    public static void main(String[] args) {
        A a = A.getInstance();
        System.out.println(a);
        a = A.getInstance();
        System.out.println(a);
    }
}
