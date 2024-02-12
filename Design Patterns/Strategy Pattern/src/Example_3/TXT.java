package Example_3;

public class TXT implements Format {
    @Override
    public String saveFile(String fileName) {
        return fileName+" is saved as txt";
    }
}
