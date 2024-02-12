package Example_4;

public class Villain implements Character {
    @Override
    public void move() {
        System.out.println("Villain Moves");
    }

    @Override
    public void attack() {
        System.out.println("Villain attacks");
    }

    @Override
    public void defend() {
        System.out.println("Villain Defends");
    }

    @Override
    public void healing() {
        System.out.println("Villain heals");
    }
}
