/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX_2;

/**
 *
 * @author Navod Madusanka
 */
public class Open implements Execute_Command{
    
    private Garage garage;
    
    public Open(Garage garage){
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.openDoor();
    }
    
}
