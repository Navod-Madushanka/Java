package Example_3;

public class Only_Instance {
    private static Only_Instance instance;
    private Only_Instance(){}
    public static synchronized Only_Instance getInstance(){
        if(instance == null){
            instance = new Only_Instance();
        }
        return instance;
    }
}
