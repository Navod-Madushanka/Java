package Example_4;

public class Hero implements Character{
    @Override
    public void move() {
        System.out.println("Hero Moves");
    }

    @Override
    public void attack() {
        System.out.println("Hero Attacks");
    }

    @Override
    public void defend() {
        System.out.println("Hero Defends");
    }

    @Override
    public void healing() {
        System.out.println("Hero healed");
    }
}
