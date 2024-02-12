package Example_3;

public class DeleteFileFromMac implements Command{
    private File file;
    public DeleteFileFromMac(File file){
        this.file = file;
    }
    @Override
    public void executeCommand() {
        file.deleteMacFile();
    }
}
