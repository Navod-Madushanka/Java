package Example_3;

public class PDF implements Format {
    @Override
    public String saveFile(String fileName) {
        return fileName+" is Saved as PDF";
    }
}
