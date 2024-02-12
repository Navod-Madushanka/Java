package com.command_pattern.EX1;

public class GarageDoorUp implements Command{
    GarageDoor garageDoor;
    public GarageDoorUp(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.up();
    }
}
