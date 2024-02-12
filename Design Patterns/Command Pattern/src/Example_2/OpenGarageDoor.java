package Example_2;

public class OpenGarageDoor implements Command{
    private Garage garage;
    public OpenGarageDoor(Garage garage){
        this.garage = garage;
    }
    @Override
    public void execute() {
        garage.garageDoorOpen();
    }
}
