package Example_3;

public class SaveFileToMac implements Command{
    private File file;
    public SaveFileToMac(File file){
        this.file = file;
    }
    @Override
    public void executeCommand() {
        file.saveMacFile();
    }
}
