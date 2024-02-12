
package wrapper_classes;

public class C {
    public static void main(String[] args) {
        Boolean b = new Boolean(true);
        Boolean b1 = new Boolean(false);
        Boolean b2 = new Boolean("True");
        Boolean b3 = new Boolean("False");
        Boolean b4 = new Boolean(null);
        Boolean b5 = new Boolean("Am not a Boolean");
        
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }
}
