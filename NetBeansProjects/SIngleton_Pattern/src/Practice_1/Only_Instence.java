/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice_1;

/**
 *
 * @author Navod Madusanka
 */
public class Only_Instence {
    private static Only_Instence instence = new Only_Instence();
    int x = 10;
    private Only_Instence(){}
    public static synchronized Only_Instence getInstence(){
        return instence;
    }
}
