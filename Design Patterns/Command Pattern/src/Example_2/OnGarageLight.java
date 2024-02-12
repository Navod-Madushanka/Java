package Example_2;

public class OnGarageLight implements Command{
    private Garage garage;
    public OnGarageLight(Garage garage){
        this.garage = garage;
    }
    @Override
    public void execute() {
        garage.garageLightOn();
    }
}
