package Example_4;

public class Game {
    public static void main(String[] args) {
        Context context = new Context(new Zombie());
        context.attackPlayer();
        context = new Context(new Vampire());
        context.attackPlayer();
        context = new Context(new Werewolf());
        context.attackPlayer();
    }
}
