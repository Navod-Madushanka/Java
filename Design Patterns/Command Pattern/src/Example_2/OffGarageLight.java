package Example_2;

public class OffGarageLight implements Command{
    private Garage garage;
    public OffGarageLight(Garage garage){
        this.garage = garage;
    }
    @Override
    public void execute() {
        garage.garageLightOff();
    }
}
