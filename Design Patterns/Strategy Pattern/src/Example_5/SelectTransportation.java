package Example_5;

public class SelectTransportation {
    public static void main(String[] args) {
        TransportMethod transportMethod = new TransportMethod(new Car());
        transportMethod.setTranspotation();
        transportMethod = new TransportMethod(new Bout());
        transportMethod.setTranspotation();
        transportMethod = new TransportMethod(new Bus());
        transportMethod.setTranspotation();
        transportMethod = new TransportMethod(new Train());
        transportMethod.setTranspotation();

    }
}
