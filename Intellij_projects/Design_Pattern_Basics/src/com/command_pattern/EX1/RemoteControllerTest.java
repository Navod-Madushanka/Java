package com.command_pattern.EX1;

public class RemoteControllerTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorUp garageDoorUp = new GarageDoorUp(garageDoor);
        GarageDoorDown garageDoorDown = new GarageDoorDown(garageDoor);
        GarageDoorStop garageDoorStop = new GarageDoorStop(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorUp);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorDown);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorStop);
        remote.buttonWasPressed();

    }
}
