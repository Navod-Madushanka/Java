
package p1;

class X{
    public void m(){
        System.out.println("X m");
    }
}

class Y extends X{

    @Override
    public void m() {
        System.out.println("Y m");
    }
    
}

public class Test{
    
    public static void main(String[] args) {
        X y = new Y();
        y.m();
    }
   
}

