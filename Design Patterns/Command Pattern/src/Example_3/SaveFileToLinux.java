package Example_3;

public class SaveFileToLinux implements Command{
    private File file;
    public SaveFileToLinux(File file){
        this.file = file;
    }
    @Override
    public void executeCommand() {
        file.savedLinuxFile();
    }
}
