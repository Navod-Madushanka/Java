
package ex_1;


class Test{
    public static void main(String[] args) {
        Balla b1 = new Balla();
        Balla b2 = new Balla();
        Balla b3 = new Balla();
        
        Game.start(b1);
        Game.start(b2);
        Game.start(b3);
    }
}

class Balla{
    public void buranava(){
        System.out.println("Baw Baw");
    }
}

public class Game {
    public static void start(Balla b){
        b.buranava();
    }
}
