package Example_4;

public class GameControls {
    private final Character hero;
    private final Character villain;
    public GameControls(){
        hero = new Hero();
        villain = new Villain();
    }

    public void heroMove(){
        hero.move();
    }
    public void villainMove(){
        villain.move();
    }
    public void heroAttack(){
        hero.attack();
    }
    public void villainAttack(){
        villain.attack();
    }
    public void heroDefend(){
        hero.defend();
    }
    public void villainDefend(){
        villain.defend();
    }
    public void heroHeal(){
        hero.healing();
    }
    public void villainHeal(){
        villain.healing();
    }
}
