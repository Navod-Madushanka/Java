
package ex_2;

import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Balla b1 = new Balla();
        Balla b2 = new Balla();
        Balla b3 = new Balla();
        
        Vector<Balla> v = new Vector();
        v.add(b1);
        v.add(b2);
        v.add(b3);
        
        Game.start(v);
    }
}

class Balla{
  public void buranawa(){
      System.out.println("Bow Bow");
  }
}

class Game{
    public static void start(Vector<Balla> v){
        v.get(0).buranawa();
        v.get(1).buranawa();
        v.get(2).buranawa();
    }
}
