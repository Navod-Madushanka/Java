
package wrapper_classes;

public class B {
    public static void main(String[] args) {
        Integer i1 = new Integer(45);
        Integer i2 = new Integer("45");
        
        Float f1 = new Float(3.14f);
        Float f2 = new Float("3.14f");
        
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("false");
        
        Character c1 = new Character('c');
        
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(c1);
    }
}
