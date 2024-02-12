package Example_4;

public class Context {
    private Enemy enemy;
    public Context(Enemy enemy){
        this.enemy = enemy;
    }
    public void attackPlayer(){
        enemy.attackType();
    }
}
