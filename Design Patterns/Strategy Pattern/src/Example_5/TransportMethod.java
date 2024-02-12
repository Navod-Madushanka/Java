package Example_5;

public class TransportMethod {
    private Transpotation transpotation;
    public TransportMethod(Transpotation transpotation){
        this.transpotation = transpotation;
    }
    public void setTranspotation(){
        transpotation.duration();
        transpotation.cost();
    }
}
