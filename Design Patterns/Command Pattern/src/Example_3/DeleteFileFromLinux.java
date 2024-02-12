package Example_3;

public class DeleteFileFromLinux implements Command{
    private File file;
    public DeleteFileFromLinux(File file){
        this.file = file;
    }
    @Override
    public void executeCommand() {
        file.deleteLinuxFile();
    }
}
