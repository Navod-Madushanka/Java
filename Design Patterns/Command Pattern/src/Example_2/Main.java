package Example_2;

public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker();

        Garage garage = new Garage();

        OpenGarageDoor openGarageDoor = new OpenGarageDoor(garage);
        broker.addCommand(openGarageDoor);

        OnGarageLight onGarageLight = new OnGarageLight(garage);
        broker.addCommand(onGarageLight);

        OffGarageLight offGarageLight = new OffGarageLight(garage);
        broker.addCommand(offGarageLight);

        CloseGarageDoor closeGarageDoor = new CloseGarageDoor(garage);
        broker.addCommand(closeGarageDoor);

        broker.executeCommands();

    }
}
