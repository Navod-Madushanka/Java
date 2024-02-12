/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical_2;

/**
 *
 * @author Navod Madusanka
 */
class Player{
    private static Player p = new Player();
    
    private Player(){}
    
    public static Player getPlayer(){
        return p;
    }
    
    public void playMusic(){
        System.out.println("Music is Playing");
    }
}

public class Practical {
    public static void main(String[] args) {
        Player p1 = Player.getPlayer();
        p1.playMusic();
    }
}
