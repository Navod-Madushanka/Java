package Example_3;

public class FileManager {
    public static void main(String[] args) {
        File file = new File("Navod.txt");
        Invoker invoker = new Invoker();
        SaveFileToWindows saveFileToWindows = new SaveFileToWindows(file);
        invoker.addCommand(saveFileToWindows);
        invoker.executeCommands();
    }
}
