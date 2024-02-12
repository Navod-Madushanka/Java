package Example_4;

public class Player {
    private static Player player = new Player();

    private Player(){}

    public static synchronized Player getPlayer(){
        return player;
    }

    public void playMusic(){
        System.out.println("Playing Music");
    }
}
