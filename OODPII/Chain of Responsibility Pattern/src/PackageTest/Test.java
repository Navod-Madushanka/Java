package PackageTest;

class X{
    int i;

    public X(int x){
        this.i = x;
    }
    Y y = new Y(i);
}

class Y{
    int i;
    public Y(int i){
        this.i = i;
    }
}

public class Test {
    public static void main(String[] args) {
        X x = new X(10);
        System.out.println(x.i);
        System.out.println(x.y.i);
    }
}
