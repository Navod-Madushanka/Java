package Example_3;

public class DeleteFileFromWindows implements Command{
    private File file;
    public DeleteFileFromWindows(File file){
        this.file = file;
    }
    @Override
    public void executeCommand() {
        file.deleteWindowsFile();
    }
}
