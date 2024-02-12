/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Navod Madusanka
 */
public class Broker {
    private List<Execute_Command> commandList = new ArrayList<>();
    
    public void takeCommand(Execute_Command command){
        commandList.add(command);
    }
    
    public void placeCommand(){
        for(Execute_Command command: commandList){
            command.execute();
        }
        commandList.clear();
    }
}
