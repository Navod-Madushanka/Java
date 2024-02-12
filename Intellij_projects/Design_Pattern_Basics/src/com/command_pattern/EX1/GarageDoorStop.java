package com.command_pattern.EX1;

public class GarageDoorStop implements Command{
    GarageDoor garageDoor;
    public GarageDoorStop(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.stop();
    }
}
