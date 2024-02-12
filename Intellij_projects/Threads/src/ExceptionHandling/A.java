package ExceptionHandling;

public class A {
    static void m(){
        System.out.println("m");
        m1();
    }
    static void m1(){
        System.out.println(10/0);
    }

    public static void main(String[] args) {
        try{
            m();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
