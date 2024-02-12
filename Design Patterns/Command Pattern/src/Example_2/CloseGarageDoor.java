package Example_2;

public class CloseGarageDoor implements Command{
    private Garage garage;
    public CloseGarageDoor(Garage garage){
        this.garage = garage;
    }
    @Override
    public void execute() {
        garage.garageDoorClose();
    }
}
