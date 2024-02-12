package Package1;

import java.util.ArrayList;
import java.util.HashMap;

class A{
    private A(){

    }
    private static HashMap<Integer, A> pool_A = new HashMap<>();
    public static A createInstance(int i){
        A instance = pool_A.get(i);
        if(instance==null){
            instance = new A();
            instance.i = i;
            pool_A.put(i, instance);
        }
        return instance;
    }
    private int i = 10;

    public int getI() {
        return i;
    }

    public A setI(int i) {
        return A.createInstance(1);
    }
}

public class Test {
    public static void main(String[] args) {
        A a1 = A.createInstance(10);
        A a2 = A.createInstance(10);

        a1 = a1.setI(20);
        System.out.println(a1==a2);
    }
}
