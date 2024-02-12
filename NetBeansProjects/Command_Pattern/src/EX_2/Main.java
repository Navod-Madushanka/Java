/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX_2;

/**
 *
 * @author Navod Madusanka
 */
public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Open open = new Open(garage);
        Broker broker = new Broker();
        broker.takeCommand(open);
        broker.placeCommand();
    }
}
