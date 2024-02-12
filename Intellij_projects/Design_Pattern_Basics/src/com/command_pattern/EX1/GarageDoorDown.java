package com.command_pattern.EX1;

public class GarageDoorDown implements Command{
    GarageDoor garageDoor;
    public GarageDoorDown(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.down();
    }
}
