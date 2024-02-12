package Example_4;

public class Game {
    public static void main(String[] args) {
        GameControls gameControls = new GameControls();
        gameControls.heroMove();
        gameControls.heroAttack();
        gameControls.heroHeal();
        gameControls.villainAttack();
    }
}
