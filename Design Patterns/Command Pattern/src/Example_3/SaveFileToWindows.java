package Example_3;

public class SaveFileToWindows implements Command{
    private File file;
    public SaveFileToWindows(File file){
        this.file = file;
    }
    @Override
    public void executeCommand() {
        file.saveWindowsFile();
    }
}
