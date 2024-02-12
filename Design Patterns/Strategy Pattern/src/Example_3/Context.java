package Example_3;

public class Context {
    private Format format;
    public Context(Format format){
        this.format = format;
    }
    public String saveFile(String filename){
        return format.saveFile(filename);
    }
}
